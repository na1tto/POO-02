package com.maisvida.models;

public class Agendamento {

    private Paciente paciente;
    private Medico medico;

    public Agendamento(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
    }

    @Override
    public String toString() {

        String infos = "\nNome do Paciente: " + paciente.getNome()
                + "\nMédico Responsável: " + medico.nome()
                + "\nEspecialidade: " + medico.especialidade()
                + "\nCRM: " + medico.CRM() + "\n";
        return infos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
