/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kingsmenuadministrativo.Controller;

import com.mycompany.kingsmenuadministrativo.Model.CupomDescontoModel;
import com.mycompany.kingsmenuadministrativo.Resources.ConnectionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author david
 */
public class CuponsControl {
    public ArrayList<CupomDescontoModel> items;
    
    public CuponsControl (){
        items = new ArrayList<>();
    }
    
    public TableModel getTable(){
        Connection con = ConnectionBD.getConnection();
        Statement st;
        ResultSet rs;
        String[] colunas = new String[]{"Cupom", "Valor", "Validade"};
        DefaultTableModel modelo = new DefaultTableModel(null, colunas);
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(getScriptCupons());
            
            while(rs.next()){
                int index = items.size();
                items.add(addItem(rs));   

                modelo.addRow(new String[] {
                    items.get(index).getCupom(),
                    "R$ " + new DecimalFormat("#.00").format(items.get(index).getValorCupom()),
                    items.get(index).getDataValidadeText()
                });
            
            }
            
            return modelo;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    public CupomDescontoModel getCupom(int index){
        return items.get(index);
    }
    
    private String getScriptCupons(){
        return  "SELECT id_cupom, cupom, DATE_FORMAT(data_validade, '%d/%m/%Y %H:%i'), valor_cupom FROM cupom_desconto;";
                
    }
    
    private CupomDescontoModel addItem(ResultSet r) throws Exception{
        CupomDescontoModel item = new CupomDescontoModel();
        
        try{           
            item.setIdCupom(r.getInt(1));
            item.setCupom(r.getString(2));
            item.setDataValidadeText(r.getString(3));
            item.setValorCupom(r.getFloat(4));

            return item;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
    }
}
