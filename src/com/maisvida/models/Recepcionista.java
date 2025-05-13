package com.maisvida.models;

public class Recepcionista extends Funcionario{
    private Paciente paciente;

    public Recepcionista(Paciente paciente) {
        this.paciente = paciente;
    }


}
