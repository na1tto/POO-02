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
        Medico m2 = new Medico("Carlos", "Cardiologista", "98765");

        // Inicializando um paciente
        Paciente paciente1 = new Paciente("Luiz", "04425657427", "Rua Dez", "91992927905", "Vale");
        System.out.println("\nPaciente Inicializado com sucesso!\n");
        System.out.printf("Nome: %s\n", paciente1.getNome());

        // Inicializando um agendamento e passando no seu construtor um paciente atrelado a ele e um médico
        Agendamento agd1 = new Agendamento(paciente1, m1);
        System.out.println("Agendamento Inicializado com sucesso! Imprimindo informações de agendamento...\n");
        System.out.println(agd1.toString());

        Agendamento agd2 = new Agendamento(paciente1, m2);
        System.out.println("\nAgendamento Inicializado com sucesso! Imprimindo informações de agendamento...\n");
        System.out.println(agd1.toString());

        // Adicionando agendamentos ao meu paciente 1
        paciente1.adicionarAgendamento(agd1);
        paciente1.adicionarAgendamento(agd2);

        // Inicializando duas consultas realizadas pelo paciente 1
        Consulta c1 = new Consulta(agd1, "O paciente está com miopia, possuindo 3 graus no olho esquerdo " +
                                  "e 2 graus no olho direito.\n");
        Consulta c2 = new Consulta(agd2, "O paciente está com suas condições cardiovasculares saudáveis para " +
                                  "a sua idade.\n");

        //obs: quando uma consulta acontece após um agendamento, o mesmo deixa de existir e se torna apenas uma consulta.

        paciente1.adicionarConsulta(c1);
        paciente1.adicionarConsulta(c2);

        // Acessando as infos de agendamento pela classe Consulta
        System.out.println("\nConsultas realizadas! Imprimindo informações de consultas...\n");
        System.out.println(c1.getInfosAgd().toString() + "\n" + c1.getLaudoMedico());
        System.out.println(c2.getInfosAgd().toString() + "\n" + c2.getLaudoMedico());

        // Temos um problema, como registraremos uma lista de retornos, consultas, e agendamentos cancelados por
        // um paciente? Como uma lista pode conter listas em java? simples, basta criar uma função de retornar historico
        // que retorna o .toString das devidas listas, apesar de não servir como histórico de fato (objetos nao
        // aparecerão na ordem em que foram instanciados), seria um jeito embrionario de representar.

    }
}