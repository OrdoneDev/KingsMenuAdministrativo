package com.mycompany.kingsmenuadministrativo.Model;

public class Endereco {

    private int idEndereco;

    private String estado;

    private String cidade;

    private String cep;

    private String rua;

    private String bairro;

    private String numero;

    private String complemento;
    
    public Endereco(){
        super();
    }

    public Endereco(String estado, String cidade, String cep, String rua, String bairro, String numero, String complemento) {
        super();
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }
        
    public void manter() {
        //TODO CRUD
    }

}
