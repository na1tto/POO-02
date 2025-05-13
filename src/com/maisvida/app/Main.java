package com.maisvida.app;
import com.maisvida.models.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // inciando o esqueleto do funcionamento da principal regra de negócio da empresa, cliente realizar agendamentos
        // e fazer consultas, recepcionistas visualizarem agendamentos.

        System.out.printf("-------------Bem vindo à +Vida!-------------\n");
        // Inicializando um Médico
        Medico m1 = new Medico("Pedro", "Oftamologista", "14526");
        Medico m2 = new Medico("Carlos", "Cardiologista", "98765");
        Medico m3 = new Medico("Fernanda", "Clinico Geral", "96486");

        // Inicializando um recepcionista
        Recepcionista recep1 = new Recepcionista("Rosival", "78452");
        System.out.println("\nRecepcionista Inicializado com sucesso!\n");
        System.out.println("Nome: " + recep1.getNome());

        // Inicializando pacientes
        Paciente paciente1 = new Paciente("Luiz", "04425657427", "Rua Dez", "91992927905", "Vale");
        System.out.println("\nPaciente Inicializado com sucesso!\n");
        System.out.printf("Nome: %s\n", paciente1.getNome());

        Paciente paciente2 = new Paciente("Clara", "91025476302", "Rua Quinze", "94996547426", "UNIMED");
        System.out.println("\nPaciente Inicializado com sucesso!\n");
        System.out.printf("Nome: %s\n", paciente2.getNome());

        // Inicializando um agendamento e passando no seu construtor um paciente atrelado a ele e um médico (paciente 01)
        Agendamento agd1 = paciente1.agendarConsulta(m1);
        System.out.println("Agendamento Inicializado com sucesso! Imprimindo informações de agendamento...");
        System.out.println(agd1.toString());

        Agendamento agd2 = paciente1.agendarConsulta(m2);
        System.out.println("\nAgendamento Inicializado com sucesso! Imprimindo informações de agendamento...");
        System.out.println(agd2.toString());
        
        // (Paciente 02)
        Agendamento agd3 = paciente2.agendarConsulta(m3);
        System.out.println("\nAgendamento Inicializado com sucesso! Imprimindo informações de agendamento...");
        System.out.println(agd3.toString());

        // Acessando agendamentos marcados
        recep1.listarAgendamentos();

        // Inicializando duas consultas realizadas pelo paciente 1
        Consulta c1 = new Consulta(agd1, "O paciente está com miopia, possuindo 3 graus no olho esquerdo " +
                                  "e 2 graus no olho direito.\n");
        Consulta c2 = new Consulta(agd2, "O paciente está com condições cardiovasculares saudáveis para " +
                                  "a sua idade.\n");

        //obs: quando uma consulta acontece após um agendamento, o mesmo deixa de existir e se torna apenas uma consulta.
        paciente1.adicionarConsulta(c1);
        paciente1.adicionarConsulta(c2);

        // Acessando as infos de agendamento pela classe Consulta (atividade do recepcionista)
        System.out.println("\nConsultas realizadas! Imprimindo informações de consultas...\n");
        System.out.println(c1.getInfosAgd().toString() + "\n" + c1.getLaudoMedico());
        System.out.println(c2.getInfosAgd().toString() + "\n" + c2.getLaudoMedico());

        // Realizando um retorno
        System.out.println("Realizando um retorno...");
        Retorno r1 = new Retorno(c2, "Entrega de exames");
        System.out.println("Retorno Realizado com sucesso!\n");
        System.out.println(r1.toString());
        paciente1.adicionarRetorno(r1);

        // testando o acesso de historico
        System.out.println(paciente1.visualizarHistorico());

    }
}