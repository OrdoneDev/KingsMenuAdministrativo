package com.mycompany.kingsmenuadministrativo.Model;

public class Produto {

    private int idProduto;

    private String nome;

    private String descricao;

    private double valor;

    private float estoque;

    private byte foto;
    
    public Produto(){
        super();
    }

    public Produto(String nome, String descricao, double valor, float estoque, byte foto) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.foto = foto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public float getEstoque() {
        return estoque;
    }

    public byte getFoto() {
        return foto;
    }    

    public void manter() {
        //TODO CRUD
    }

}
