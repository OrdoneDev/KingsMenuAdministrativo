package com.mycompany.kingsmenuadministrativo.Model;

public class ProdutoModel {

    private int idProduto;

    private String nome;

    private String descricao;

    private double valor;

    private float estoque;

    private byte foto;
    
    private CategoriasModel categoria;
    
    public ProdutoModel(){
        super();
        
        categoria = new CategoriasModel();
    }

    public ProdutoModel(String nome, String descricao, double valor, float estoque, byte foto, CategoriasModel categoria) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.foto = foto;
        this.categoria = categoria;
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

    public void setCategoria(CategoriasModel categoria) {
        this.categoria = categoria;
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

    public CategoriasModel getCategoria() {
        return categoria;
    }

    public void manter() {
        //TODO CRUD
    }

}
