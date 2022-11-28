package com.mycompany.kingsmenuadministrativo.Model;

import java.util.Date;

public class CupomDescontoModel {

    private int idCupom;

    private Date dataValidade;
    
    private String dataValidadeText;

    private float valorCupom;

    private String cupom;
    
    public CupomDescontoModel(){
        super();
    }

    public CupomDescontoModel(Date dataValidade, float valorCupom, String cupom) {
        super();
        this.dataValidade = dataValidade;
        this.valorCupom = valorCupom;
        this.cupom = cupom;
    }

    public void setIdCupom(int idCupom) {
        this.idCupom = idCupom;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setDataValidadeText(String dataValidadeText) {
        this.dataValidadeText = dataValidadeText;
    }

    public void setValorCupom(float valorCupom) {
        this.valorCupom = valorCupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public int getIdCupom() {
        return idCupom;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public String getDataValidadeText() {
        return dataValidadeText;
    }

    public float getValorCupom() {
        return valorCupom;
    }

    public String getCupom() {
        return cupom;
    }

    public void manter() {
        //TODO CRUD
    }

}
