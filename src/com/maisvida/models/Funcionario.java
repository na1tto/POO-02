package com.maisvida.models;
import java.util.Date;

public class Funcionario extends Usuario{

    private long idFuncionario;

    public Funcionario(){
    }

    public Funcionario(String nome, String email, Date dataNascimento, long idFuncionario) {
        super(nome, email, dataNascimento);
        this.idFuncionario = idFuncionario;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
