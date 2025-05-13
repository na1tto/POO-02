package com.maisvida.models;

import com.maisvida.utils.CentralAgd;

public class Recepcionista extends Funcionario{
    private String numID;

    public Recepcionista(String nome, String numID) {
        super.setNome(nome);
        this.numID = numID;
    }

    public void listarAgendamentos(){
        System.out.println("\nConsultas Agendadas: ");
        for (Agendamento ag : CentralAgd.getAgendamentos()) {
            System.out.println(ag);
        }
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }
}
