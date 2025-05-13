package com.maisvida.utils;

import com.maisvida.models.Agendamento;

import java.util.ArrayList;
import java.util.List;

public class CentralAgd{

    private static final List<Agendamento> agendamentos = new ArrayList<Agendamento>();

    public static void addAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);

    }

    public static List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

}
