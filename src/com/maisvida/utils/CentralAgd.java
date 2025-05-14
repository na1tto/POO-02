package com.maisvida.utils;

import com.maisvida.models.Agendamento;

import java.util.ArrayList;
import java.util.List;

public class CentralAgd{
    //Central total de agendamentos

    private static final List<Agendamento> agendamentos = new ArrayList<Agendamento>();

    //Adiciona um agendamento à central
    public static void addAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);

    }

    public static List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

}
