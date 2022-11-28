package com.mycompany.kingsmenuadministrativo.Model;

public class CategoriasModel {

    private int idCategoria;
    private String nome;
    private String descrição;
    
    public CategoriasModel() {
        super();
    }

    public CategoriasModel(String nome, String descrição) {
        super();
        this.nome = nome;
        this.descrição = descrição;
    }
  
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void manter() {
        //TODO CRUD
    }

}
