/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kingsmenuadministrativo.Controller;

import com.mycompany.kingsmenuadministrativo.Model.VendaModel;
import com.mycompany.kingsmenuadministrativo.Resources.ConnectionBD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author david
 */
public class PedidosControl {
    public ArrayList<VendaModel> items;
    
    public PedidosControl (){
        items = new ArrayList<>();
    }
    
    public void alterarStatus(int index, boolean proximo){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            
            int status_atual = items.get(index).getStatusPedido();
            
            if((status_atual == 4 && proximo) || (status_atual == 1 && !proximo))
                return;
            
            status_atual = (proximo ? status_atual + 1 : status_atual - 1);
            items.get(index).setStatusPedido(status_atual);
            
            String script = getScriptUpdate(proximo) + items.get(index).getIdVenda() + ";";
            st.executeUpdate(script);
            
            if (proximo && status_atual == 4){
                script = getScriptUpdateHoraEntrega(items.get(index).getIdVenda());
                st.executeUpdate(script);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public TableModel getTable(){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        String[] colunas = new String[]{"Nome", "Horário pedido", "Valor", "Status"};
        DefaultTableModel modelo = new DefaultTableModel(null, colunas);
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(getScriptPedidos());
            
            while(rs.next()){
                int index = items.size();
                items.add(addItem(rs));   

                modelo.addRow(new String[] {
                    items.get(index).cliente.getNome(),
                    items.get(index).getDataHoraPedidoText(),
                    "R$ " + new DecimalFormat("0.00").format(items.get(index).getValorTotal()),
                    items.get(index).getStatusPedidoText()
                });
            
            }
            
            return modelo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    private String getScriptUpdateHoraEntrega(int id_venda) {
        return "UPDATE VENDA SET data_hora_entrega = now() WHERE ID_VENDA = " + id_venda + ";";
    }
    
    private String getScriptUpdate(boolean proximo){
        return (proximo ? "UPDATE VENDA SET STATUS_PEDIDO = CAST(STATUS_PEDIDO AS UNSIGNED) "
                + "+ 1 WHERE ID_VENDA = " : "UPDATE VENDA SET "
                + "STATUS_PEDIDO = CAST(STATUS_PEDIDO AS UNSIGNED) - 1 WHERE ID_VENDA = ");
    }
    
    private String getScriptPedidos(){
        return  "SELECT V.id_venda, C.nome, DATE_FORMAT(V.data_hora_pedido, '%d/%m %H:%i'), \n" +
                "(V.valor_taxa_entrega + V.valor_total - COALESCE(CD.valor_cupom,0)) AS 'Valor total',\n" +
                "V.status_pedido \n" +
                "FROM VENDA V\n" +
                "LEFT JOIN endereco_entrega_cliente EE\n" +
                "ON V.id_cliente_endereco = EE.id_endereco_entrega\n" +
                "LEFT JOIN cliente C\n" +
                "ON EE.id_cliente = C.id_cliente\n" +
                "LEFT JOIN cupom_desconto CD\n" +
                "ON V.id_cupom = CD.id_cupom\n" +
                "WHERE (V.status_pedido <> 4 OR TIMESTAMPDIFF(MINUTE, V.data_hora_entrega, now()) < 5) AND V.status_pedido IS NOT NULL\n" +
                "ORDER BY V.data_hora_pedido;";
    }
    
    private VendaModel addItem(ResultSet r) throws Exception{
        VendaModel item = new VendaModel();
        
        try{
            item.setIdVenda(r.getInt(1));
            item.cliente.setNome(r.getString(2));
            item.setDataHoraPedidoText(r.getString(3));
            item.setValorTotal(r.getDouble(4));
            item.setStatusPedido(r.getInt(5));

            String status_pedido = (item.getStatusPedido() == 1 ? 
                    "Recebido" : (item.getStatusPedido() == 2 ? 
                    "Preparação" : (item.getStatusPedido() == 3 ? 
                    "Rota de entrega" : "Finalizado")));
            
            item.setStatusPedidoText(status_pedido);
            
            return item;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
