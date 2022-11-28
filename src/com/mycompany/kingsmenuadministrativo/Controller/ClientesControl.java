/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kingsmenuadministrativo.Controller;

import com.mycompany.kingsmenuadministrativo.Model.ClienteModel;
import com.mycompany.kingsmenuadministrativo.Model.EnderecoModel;
import com.mycompany.kingsmenuadministrativo.Resources.ConnectionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author david
 */
public class ClientesControl {
    public ArrayList<ClienteModel> items;
    
    public ClientesControl (){
        items = new ArrayList<>();
    }
    
    public ArrayList<EnderecoModel> getEnderecos(int id_cliente) {
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        ArrayList<EnderecoModel> enderecos = new ArrayList<>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(getScriptEndereco(id_cliente));
            
            while(rs.next()){
                EnderecoModel endereco_temp = new EnderecoModel();
                
                endereco_temp.setIdEndereco(rs.getInt(1));
                endereco_temp.setRua(rs.getString(2));
                endereco_temp.setNumero(rs.getString(3));
                endereco_temp.setComplemento(rs.getString(4));
                endereco_temp.setCep(rs.getString(5));
                endereco_temp.setBairro(rs.getString(6));
                endereco_temp.setCidade(rs.getString(7));
                endereco_temp.setEstado(rs.getString(8));
                
                enderecos.add(endereco_temp);   
            }
            
            return enderecos;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return null;
    }
    
    public TableModel getTable(){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        String[] colunas = new String[]{"Nome", "CPF", "Telefone"};
        DefaultTableModel modelo = new DefaultTableModel(null, colunas);
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(getScriptClientes());
            
            while(rs.next()){
                int index = items.size();
                items.add(addItem(rs));   

                modelo.addRow(new String[] {
                    items.get(index).getNome(),
                    items.get(index).getCpf(),
                    items.get(index).getTelefone()
                });
            
            }
            
            return modelo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public ClienteModel getCliente(int index){
        return items.get(index);
    }
    
    private String getScriptEndereco(int id_cliente){
        return "SELECT E.id_endereco, E.rua, E.numero, E.complemento, E.cep, " +
                "E.bairro, E.cidade, E.estado FROM cliente AS C " +
                "LEFT JOIN endereco_entrega_cliente AS EE " +
                "ON C.id_cliente = EE.id_cliente " +
                "LEFT JOIN endereco AS E " +
                "ON EE.id_endereco = E.id_endereco " +
                "WHERE C.id_cliente = " + id_cliente + ";";
    }
    
    private String getScriptClientes(){
        return  "SELECT id_cliente, nome, data_nascimento, senha, cpf, telefone, email FROM cliente;";
                
    }
    
    private ClienteModel addItem(ResultSet r) throws Exception{
        ClienteModel item = new ClienteModel();
        
        try{           
            item.setIdCliente(r.getInt(1));
            item.setNome(r.getString(2));
            item.setDataNascimento(r.getDate(3));
            item.setSenha(r.getString(4));
            item.setCpf(r.getString(5));
            item.setTelefone(r.getString(6));
            item.setEmail(r.getString(7));
            item.setEndereco(getEnderecos(item.getIdCliente()));

            return item;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
