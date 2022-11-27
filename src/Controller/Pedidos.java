/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.mycompany.kingsmenuadministrativo.Model.Venda;
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
public class Pedidos {
    public ArrayList<Venda> items;
    
    public Pedidos (){
        items = new ArrayList<>();
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
                    "R$ " + new DecimalFormat("#.00").format(items.get(index).getValorTotal()),
                    items.get(index).getStatusPedidoText()
                });
            
            }
            
            return modelo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
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
                "WHERE V.status_pedido <> 4 AND V.status_pedido IS NOT NULL;";
    }
    
    private Venda addItem(ResultSet r) throws Exception{
        Venda item = new Venda();
        
        try{
            item.setIdVenda(r.getInt(1));
            item.cliente.setNome(r.getString(2));
            item.setDataHoraPedidoText(r.getString(3));
            item.setValorTotal(r.getDouble(4));
            
            String status_pedido = r.getString(5);

            status_pedido = (status_pedido.equals("1") ? 
                    "Recebido" : (status_pedido.equals("2") ? 
                    "Preparação" : (status_pedido.equals("3") 
                    ? "Rota de entrega" : "Finalizado")));
            
            item.setStatusPedidoText(status_pedido);
            
            return item;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
