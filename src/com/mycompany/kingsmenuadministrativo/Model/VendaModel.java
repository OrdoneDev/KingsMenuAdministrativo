package com.mycompany.kingsmenuadministrativo.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class VendaModel {

    private int idVenda;

    private LocalDateTime dataHoraPedido;
    
    private String dataHoraPedidoText;

    private LocalDateTime dataHoraEntrega;

    private int statusPedido;
    
    private String statusPedidoText;

    private double valorTotal;

    private int idEnderecoEntrega;

    private float valorTaxaEntrega;

    public ArrayList<ItemVendaModel> itemVenda;

    public ClienteModel cliente;
    
    public VendaModel(){
        super();
        
        itemVenda = new ArrayList<>();
        cliente = new ClienteModel();
    }
    
    public VendaModel(LocalDateTime dataHoraPedido, LocalDateTime dataHoraEntrega, int statusPedido, double valorTotal, int idEnderecoEntrega, float valorTaxaEntrega, ArrayList<ItemVendaModel> itemVenda, ClienteModel cliente) {
        super();
        this.dataHoraPedido = dataHoraPedido;
        this.dataHoraEntrega = dataHoraEntrega;
        this.statusPedido = statusPedido;
        this.valorTotal = valorTotal;
        this.idEnderecoEntrega = idEnderecoEntrega;
        this.valorTaxaEntrega = valorTaxaEntrega;
        this.itemVenda = itemVenda;
        this.cliente = cliente;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public void setDataHoraPedidoText(String dataHoraPedidoText) {
        this.dataHoraPedidoText = dataHoraPedidoText;
    }

    public void setDataHoraEntrega(LocalDateTime dataHoraEntrega) {
        this.dataHoraEntrega = dataHoraEntrega;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void setStatusPedidoText(String statusPedidoText) {
        this.statusPedidoText = statusPedidoText;
    }  
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdEnderecoEntrega(int idEnderecoEntrega) {
        this.idEnderecoEntrega = idEnderecoEntrega;
    }

    public void setValorTaxaEntrega(float valorTaxaEntrega) {
        this.valorTaxaEntrega = valorTaxaEntrega;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public String getDataHoraPedidoText() {
        return dataHoraPedidoText;
    }

    public LocalDateTime getDataHoraEntrega() {
        return dataHoraEntrega;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public String getStatusPedidoText() {
        return statusPedidoText;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getIdEnderecoEntrega() {
        return idEnderecoEntrega;
    }

    public float getValorTaxaEntrega() {
        return valorTaxaEntrega;
    }

    public void manter() {
        //TODO CRUD
    }

}
