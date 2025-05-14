# Sistema de Agendamento de Consultas Médicas

Este projeto foi desenvolvido como parte da disciplina **Programação Orientada a Objetos II (POO II)**, com a demanda originada na disciplina de **Análise e Projeto de Software**. O objetivo principal foi implementar uma funcionalidade específica de um sistema de uma clínica médica: **o agendamento de consultas pelos próprios pacientes**, sem a necessidade de um funcionário intermediando o processo.

## 👥 Integrantes do Grupo

- Israel Martins de Moura Barros  
- Sandro Almeida de Moraes  
- Luiz Eduardo Pereira Sousa  
- Rosival Soares Peres Junior

## 📌 Objetivo do Sistema

O sistema tem como foco **permitir que os pacientes agendem suas consultas de forma independente**. Para simplificação, foi implementada apenas a funcionalidade de **agendamento de consultas**, servindo como uma prova de conceito da ideia geral do sistema.

### Funcionalidades Implementadas

- **Pacientes:**
  - Agendamento de consultas
  - Agendamento de retornos
  - Visualização do histórico de agendamentos

- **Recepcionistas:**
  - Acesso ao histórico total de agendamentos

- **Médicos:**
  - Representados apenas por uma `record class`
  - Sem interação direta com o sistema

## 💻 Tecnologias Utilizadas

- Linguagem: Java
- Paradigma: Programação Orientada a Objetos
- Conceitos aplicados:
  - Encapsulamento
  - Herança
  - Polimorfismo
  - Record Classes (Java 14+)

## 🛠️ Estrutura do Projeto

```

src/
├── Main.java
├── model/
│   ├── Paciente.java
│   ├── Medico.java (record)
│   ├── Consulta.java
│   └── Agendamento.java
├── controller/
│   └── AgendamentoController.java
└── view/
└── InterfaceSimples.java

```

## 🎯 Considerações Finais

Este projeto representa apenas uma **parte do sistema completo da clínica médica**, focando na funcionalidade de agendamento para **fins didáticos e de modelagem**. A simplicidade da implementação permitiu o aprofundamento em boas práticas de modelagem orientada a objetos e colaboração em grupo.

## 📄 Licença

Este projeto é apenas acadêmico e não possui fins comerciais.
```
