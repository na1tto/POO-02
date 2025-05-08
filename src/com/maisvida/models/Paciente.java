package com.maisvida.models;

import java.util.List;

public class Paciente extends Usuario{

    private long idPaciente;

    private String CPF;
    private String endereco;
    private String telefone;
    private String convenio;
    private List<Consulta> consultas;
    private List<Retorno> retornos;
    private List<Agendamento> agendamentos;

    public Paciente() {}

    public Paciente(String CPF, String endereco, String telefone, String convenio) {}

    public List visualizarHistorico(){
        return null;
    }

    @Override
    public boolean cadastrar() {
        return false;
    }

    @Override
    public boolean logar(){
        return false;
    }

    public long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Retorno> getRetornos() {
        return retornos;
    }

    public void setRetornos(List<Retorno> retornos) {
        this.retornos = retornos;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}
