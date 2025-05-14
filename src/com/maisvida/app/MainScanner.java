package com.maisvida.app;
import com.maisvida.models.*;
import java.util.Scanner;

// Usuário se registrando, realizando agendamentos, consultas e retornos, e consultando seu histórico.

public class MainScanner {

    public static void main(String[] args) {
        String nomePaciente;
        String cpfPaciente;
        String enderecoPaciente;
        String telefonePaciente;
        String convenioPaciente;
        String opcao = "S";

        Agendamento agd;
        Consulta consulta;
        Retorno retorno;

        Scanner scanner = new Scanner(System.in);

        System.out.print("-------------Bem vindo à +Vida!-------------\n");
        System.out.print("-------Vamos iniciar seu cadastro!-------\n");


        //Loop para entrada de dados caso os dados do paciente não estejam corretos
        while (true) {

            System.out.print("Digite o seu nome: \n");
            nomePaciente = scanner.nextLine();
            System.out.print("Digite o seu CPF: \n");
            cpfPaciente = scanner.nextLine();
            System.out.print("Digite o seu endereço: \n");
            enderecoPaciente = scanner.nextLine();
            System.out.print("Digite o seu telefone: \n");
            telefonePaciente = scanner.nextLine();
            System.out.print("Digite o seu convênio: \n");
            convenioPaciente = scanner.nextLine();

            System.out.println("Apresentando dados...");
            System.out.printf("\nNome: %s", nomePaciente);
            System.out.printf("\nCPF: %s", cpfPaciente);
            System.out.printf("\nEndereço: %s", enderecoPaciente);
            System.out.printf("\nTelefone: %s", telefonePaciente);
            System.out.printf("\nConvenio: %s\n", convenioPaciente);

            System.out.print("\nOs dados estão corretos? (S/N): \n");
            String resposta = scanner.nextLine();

            if ("S".equalsIgnoreCase(resposta)) {
                break;
            } else {
                System.out.println("\nRefaça seu cadastro!");
            }
        } //Fim do loop para entrada de dados de cadastro

        //Criação do objeto paciente com os dados do paciente cadastrado
        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, enderecoPaciente, telefonePaciente, convenioPaciente);
        System.out.print("\nVocê foi cadastrado com sucesso!");

        //Loop para realização de agendamentos e retornos
        while (opcao.equals("S")) {

            //Inicialização dos objetos médicos e escolha do especialista
            System.out.println("Agora escolha com qual especialista quer se consultar:");
            Medico medicoPedro = new Medico("Pedro", "Oftalmologista", "14526");
            Medico medicoCarlos = new Medico("Carlos", "Cardiologista", "98765");
            Medico medicoFernanda = new Medico("Fernanda", "Clinico Geral", "96486");

            System.out.print("\n1 - Dr. Pedro (Oftalmologista)");
            System.out.print("\n2 - Dr. Carlos (Cardiologista)");
            System.out.println("\n3 - Dra. Fernanda (Clinico Geral)");
            int escolhaMedico = scanner.nextInt();
            scanner.nextLine();


            //Inicialização do objeto médico escolhido como NULL, que será setado abaixo
            Medico medicoEscolhido = null;

            switch (escolhaMedico) {
                case 1:
                    medicoEscolhido = medicoPedro;
                    System.out.println("Você escolheu o Dr. Pedro (Oftalmologista)");
                    break;
                case 2:
                    medicoEscolhido = medicoCarlos;
                    System.out.println("Você escolheu o Dr. Carlos (Cardiologista)");
                    break;
                case 3:
                    medicoEscolhido = medicoFernanda;
                    System.out.println("Você escolheu a Dra. Fernanda (Clinico Geral)");
                    break;
                default:
                    System.out.println("Opção inválida");
                    return;
            }

            //Inicialização dos agendamentos
            System.out.print("\n------Iniciando seu agendamento!------\n");

            System.out.print("\nDigite o dia da consulta (formato: dd/mm/aaaa): ");
            String diaConsulta = scanner.nextLine();

            System.out.print("\nDigite o horário da consulta (formato: hh:mm): \n");
            String horarioConsulta = scanner.nextLine();

            System.out.println("Agendando consulta...");
            System.out.printf("\nConsulta com o Dr. %s (%s) agendado para o dia %s ás %s com sucesso!\n",
                    medicoEscolhido.nome(), medicoEscolhido.especialidade(), diaConsulta, horarioConsulta);

            //Objeto agd recebe a consulta agendada
            agd = paciente.agendarConsulta(medicoEscolhido);

            System.out.println("\nConsulta realizada com sucesso!\n");

            consulta = new Consulta(agd);
            paciente.adicionarConsulta(consulta);

            //Agendamento do retorno
            System.out.println("Deseja marcar um retorno? (S/N): ");
            String opcRetorno = scanner.nextLine();

            if ("S".equalsIgnoreCase(opcRetorno)) {
                System.out.println("\nDigite o dia do retorno (formato: dd/mm/aaaa): ");
                String diaRetorno = scanner.nextLine();

                System.out.print("\nDigite o horário do retorno (formato: hh:mm): \n");
                String horarioRetorno = scanner.nextLine();

                System.out.println("Digite o motivo do retorno: \n");
                String motivoRetorno = scanner.nextLine();

                System.out.println("Agendando retorno...");
                System.out.printf("\nRetorno com Dr. %s (%s) agendado para o dia %s ás %s com sucesso!\n",
                        medicoEscolhido.nome(), medicoEscolhido.especialidade(), diaRetorno, horarioRetorno);
                retorno = new Retorno(consulta, motivoRetorno);

                System.out.println("\nRetorno realizado com sucesso!\n");
                paciente.adicionarRetorno(retorno);
            }

            System.out.println("Deseja realizar mais um agendamento? (S/N):");
            opcao = scanner.nextLine();
        } //Fim do loop de realização de agendamentos e retornos

        //Ver histórico de agendamentos
        System.out.println("Deseja ver o histórico dos seus agendamentos? (S/N):");
        opcao = scanner.nextLine();
        if(opcao.equals("S")){
            System.out.println(paciente.visualizarHistorico());
        }
    }
}