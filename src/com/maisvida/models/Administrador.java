package com.maisvida.models;

import java.util.Date;

public class Administrador extends Funcionario{


    public Administrador(String nome, String email, String senha, Date dataNascimento, long idFuncionario) {
        super(nome, email, senha, dataNascimento, idFuncionario);
    }

    public Administrador(){}
}
