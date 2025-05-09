package com.maisvida.models;

import java.util.Date;

public class Administrador extends Funcionario{

    private String nivelDeAcesso;

    public Administrador(String nome, String email, String senha, Date dataNascimento, long idFuncionario, String nivelDeAcesso) {
        super(nome, email, senha, dataNascimento, idFuncionario);
        this.nivelDeAcesso = "Administrador";
    }

    public Administrador(){}

    @Override
    public boolean logar(){
        return false;
    }

    @Override
    public boolean cadastrar(){
        return false;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
}
