package com.mycompany.kingsmenuadministrativo.Model;

public class ItemVendaModel {

    private int idItemVenda;

    private double quantidade;

    private ProdutoModel produto;
    
    public ItemVendaModel(){
        super();
    }

    public ItemVendaModel(double quantidade, ProdutoModel produto) {
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

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void manter() {
        //TODO CRUD
    }

}
