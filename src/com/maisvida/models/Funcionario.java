package com.maisvida.models;
import java.util.Date;

public class Funcionario extends Usuario{

    private long idFuncionario;


    public Funcionario(){
    }

    public Funcionario(String nome, String email, String senha, Date dataNascimento, long idFuncionario) {
        super(nome, email, senha, dataNascimento);
        this.idFuncionario = idFuncionario;
    }

    @Override
    public boolean cadastrar(){
        return false;
    }
    @Override
    public boolean logar(){
        return false;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
