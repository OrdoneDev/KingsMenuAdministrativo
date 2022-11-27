package com.mycompany.kingsmenuadministrativo.Model;

public class Categorias {

    private int idCategoria;
    private String nome;
    private String descrição;
    
    public Categorias() {
        super();
    }

    public Categorias(String nome, String descrição) {
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
