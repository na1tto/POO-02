package com.maisvida.app;
import com.maisvida.models.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // inciando o esqueleto do funcionamento da principal regra de negócio da empresa, cliente realizar agendamentos
        // e fazer consultas, recepcionistas visualizarem agendamentos.

        System.out.printf("Bem vindo à +Vida!\n");
        // Inicializando um Médico
        Medico m1 = new Medico("Pedro", "Oftamologista", "14526");

        // Inicializando um paciente
        Paciente paciente1 = new Paciente("Luiz", "04425657427", "Rua Dez", "91992927905", "Vale");
        System.out.println("Paciente Inicializado com sucesso!\n");
        System.out.printf("Nome: %s\n", paciente1.getNome());

        // Inicializando um agendamento e passando no seu construtor um paciente atrelado a ele e um médico
        Agendamento agd1 = new Agendamento(paciente1, m1);
        System.out.println("Agendamento Inicializado com sucesso! Imprimindo informações de agendamento...\n");
        System.out.println(agd1.toString());

        // Adicionando um agendamento ao meu paciente 1
        paciente1.adicionarAgendamento(agd1);

        // Inicializando uma consulta realizada
        System.out.println("Consulta realizada! Imprimindo informações de consulta...\n");
        Consulta c1 = new Consulta(agd1, "O paciente está com miopia, possuindo 3 graus no olho esquerdo " +
                                  "e 2 graus no olho direito");

        // Acessando as infos de agendamento pela classe Consulta
        System.out.println(c1.getInfosAgd().toString() + "\n" + c1.getLaudoMedico());

    }
}