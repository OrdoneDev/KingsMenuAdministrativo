package com.mycompany.kingsmenuadministrativo.Model;

public class ItemVenda {

    private int idItemVenda;

    private double quantidade;

    private Produto produto;
    
    public ItemVenda(){
        super();
    }

    public ItemVenda(double quantidade, Produto produto) {
        super();
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void manter() {
        //TODO CRUD
    }

}
