package com.maisvida.models;

public class Agendamento {

    public String nomeAgendamento;

    public Agendamento(String nomeAgendamento) {
        this.nomeAgendamento = nomeAgendamento;
    }

    @Override
    public String toString() {
        return "Consulta{" + "nomeConsulta=" + nomeAgendamento + '}';
    }
}
