package com.maisvida.models;

public class Consulta {
    private Agendamento infosAgd;
    private String laudoMedico;

    public Consulta(Agendamento infosAgd) {
        this.infosAgd = infosAgd;
    }

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
