package com.maisvida.models;

import java.util.Date;

public abstract class Usuario {
    private String nome;
    private String email;
    private Date dataNascimento;

    public Usuario() {
    } //NoArgsConstructor

    public Usuario(String nome, String email, Date dataNascimento) { // AllArgsConstructor
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
