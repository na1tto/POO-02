package com.maisvida.models;

public class Administrador extends Funcionario{

    private String nivelDeAcesso;

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
