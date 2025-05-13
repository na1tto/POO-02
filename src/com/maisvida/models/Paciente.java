package com.maisvida.models;

import java.util.ArrayList;

import java.util.List;

public class Paciente extends Usuario{

    private long idPaciente;
    private String CPF;
    private String endereco;
    private String telefone;
    private String convenio;
    private List<Consulta> consultas; // Contem consultas
    private List<Retorno> retornos; // Contem retornos
    private List<Agendamento> agendamentos; // Contem agendamentos

    public Paciente() {

    }

    public Paciente(String nome, String CPF, String endereco, String telefone, String convenio) {
        super.setNome(nome);
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        this.convenio = convenio;

        // Inicializando listas vazias para manipular depois
        this.consultas = new ArrayList<>();
        this.retornos = new ArrayList<>();
        this.agendamentos = new ArrayList<>();

    }

    // Retornando o histórico de consultas, retornos e agendamentos de um paciente
    public String visualizarHistorico(){
        return consultas.toString() +"\n" + "\n" + agendamentos.toString();
    }

    public void adicionarAgendamento(Agendamento agd){
        this.agendamentos.add(agd);
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void adicionarRetorno(Retorno retorno){
        this.retornos.add(retorno);
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
