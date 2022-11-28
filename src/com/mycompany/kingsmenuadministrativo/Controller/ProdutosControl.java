/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kingsmenuadministrativo.Controller;

import com.mycompany.kingsmenuadministrativo.Model.CategoriasModel;
import com.mycompany.kingsmenuadministrativo.Model.ProdutoModel;
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
public class ProdutosControl {
    public ArrayList<ProdutoModel> items;
    
    public ProdutosControl (){
        items = new ArrayList<>();
    }
    
    public void novoProduto(){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
              
            String script = getScriptNovoProduto();
            st.execute(script);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void atualizarProduto(ProdutoModel produto){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
              
            String script = getScriptAtualizaProduto(produto);
            st.executeUpdate(script);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public void deletarProduto(int index){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
              
            String script = getScriptDeleteProduto(items.get(index).getIdProduto());
            st.executeUpdate(script);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public TableModel getTable(){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        String[] colunas = new String[]{"Nome", "Descrição"};
        DefaultTableModel modelo = new DefaultTableModel(null, colunas);
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(getScriptProdutos());
            
            while(rs.next()){
                int index = items.size();
                items.add(addItem(rs));   

                modelo.addRow(new String[] {
                    items.get(index).getNome(),
                    items.get(index).getDescricao()
                });
            
            }
            
            return modelo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public void setProduto(int index, ProdutoModel produto){
        items.set(index, produto);
        atualizarProduto(produto);
    }
    
    public ProdutoModel getProduto(int index){
        return items.get(index);
    }
    
    private String getScriptNovoProduto(){
        return "INSERT INTO PRODUTO (`nome`, `descricao`, `valor`) VALUES ('Novo', '', 0);";
    }
            
    private String getScriptAtualizaProduto(ProdutoModel produto) {
        return "UPDATE PRODUTO SET nome = '" + produto.getNome() +
                "', descricao = '" + produto.getDescricao() + 
                "', valor = " + produto.getValor() +
                " WHERE id_produto = " + produto.getIdProduto() + ";";
    }
    
    private String getScriptDeleteProduto(int id_produto) {
        return "DELETE FROM produto WHERE id_produto = " + id_produto + ";";
    }
    
    private String getScriptProdutos(){
        return  "SELECT P.id_produto, C.id_categoria, P.foto, P.nome, P.descricao, P.valor, " +
                "C.nome AS 'Categoria',  C.descricao AS 'Descrição categoria' " +
                "FROM produto P " +
                "LEFT JOIN categorias C " + 
                "ON P.id_categoria = C.id_categoria;";
                
    }
    
    private ProdutoModel addItem(ResultSet r) throws Exception{
        ProdutoModel item = new ProdutoModel();
        CategoriasModel categoria = new CategoriasModel();
        
        try{
            categoria.setIdCategoria(r.getInt(2));
            categoria.setNome(r.getString(7));
            categoria.setDescrição(r.getString(8));
            
            item.setFoto(r.getByte(3));
            item.setIdProduto(r.getInt(1));
            item.setCategoria(categoria);
            item.setNome(r.getString(4));
            item.setDescricao(r.getString(5));
            item.setValor(r.getDouble(6));

            return item;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
