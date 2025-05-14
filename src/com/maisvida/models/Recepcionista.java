package com.maisvida.models;

import com.maisvida.utils.CentralAgd;

public class Recepcionista extends Funcionario{
    private String numID;

    //Construtor Recepcionista
    public Recepcionista(String nome, String numID) {
        super.setNome(nome);
        this.numID = numID;
    }

    //Metodo para listar os agendamentos do dia
    public void listarAgendamentos(){
        System.out.println("\n---------------Dashboard Recepcionista-------------------");
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
