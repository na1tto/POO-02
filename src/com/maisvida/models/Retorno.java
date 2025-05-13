package com.maisvida.models;

public class Retorno {
    private Consulta consulta;
    private String motivoRetorno;

    public Retorno(Consulta consulta, String motivoRetorno) {
        this.motivoRetorno = motivoRetorno;
        this.consulta = consulta;
    }

    @Override
    public String toString() {

        String infos = "\nNome do Paciente: " + this.consulta.getInfosAgd().getPaciente().getNome()
                + "\nMédico Responsável: " + this.consulta.getInfosAgd().getMedico().nome()
                + "\nEspecialidade: " + this.consulta.getInfosAgd().getMedico().especialidade()
                + "\nCRM: " + this.consulta.getInfosAgd().getMedico().CRM()
                + "\nMotivo do retorno: " + this.motivoRetorno;
        return infos;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getMotivoRetorno() {
        return motivoRetorno;
    }

    public void setMotivoRetorno(String motivoRetorno) {
        this.motivoRetorno = motivoRetorno;
    }
}
