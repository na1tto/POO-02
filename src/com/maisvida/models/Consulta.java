package com.maisvida.models;

import com.maisvida.utils.Feedback;

public class Consulta implements Feedback{
    private Agendamento infosAgd;
    private String laudoMedico;

    public Consulta(Agendamento infosAgd, String laudoMedico) {
        this.infosAgd = infosAgd;
        this.laudoMedico = laudoMedico;
    }

    @Override
    public String toString() {
        String infos = this.infosAgd.toString() + "\nLaudo: " + this.laudoMedico + "\n";

        return infos;
    }

    public Agendamento getInfosAgd() {
        return infosAgd;
    }

    public void setInfosAgd(Agendamento infosAgd) {
        this.infosAgd = infosAgd;
    }

    public String getLaudoMedico() {
        return laudoMedico;
    }

    public void setLaudoMedico(String laudoMedico) {
        this.laudoMedico = laudoMedico;
    }
}
