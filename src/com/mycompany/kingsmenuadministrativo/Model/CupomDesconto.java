package com.mycompany.kingsmenuadministrativo.Model;

import java.util.Date;

public class CupomDesconto {

    private int idCupom;

    private Date dataValidade;

    private float valorCupom;

    private String cupom;
    
    public CupomDesconto(){
        super();
    }

    public CupomDesconto(Date dataValidade, float valorCupom, String cupom) {
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
