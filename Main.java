package com.mycompany.funcionarios;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Cadastrar funcionário #" + (i + 1));
            System.out.print("Digite o tipo (1-Assalariado, 2-Horista): ");
            int tipo = sc.nextInt();
            sc.nextLine(); // consumir a quebra de linha

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Endereço: ");
            String endereco = sc.nextLine();
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            System.out.print("Setor: ");
            String setor = sc.nextLine();

            if (tipo == 1) {
                System.out.print("Salário Mensal: ");
                double salario = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new Assalariado(nome, cpf, endereco, telefone, setor, salario));
            } else if (tipo == 2) {
                System.out.print("Horas Trabalhadas: ");
                int horas = sc.nextInt();
                System.out.print("Valor da Hora: ");
                double valorHora = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new Horista(nome, cpf, endereco, telefone, setor, horas, valorHora));
            } else {
                System.out.println("Tipo inválido!");
                i--; // refazer a iteração
            }
            System.out.println();
        }

        System.out.println("=== Dados e Pagamentos ===");
        for (Funcionarios f : funcionarios) {
            f.exibirDados();
            System.out.println("---------------------------");
        }

        System.out.print("Informe o percentual de aumento: ");
        double aumento = sc.nextDouble();
        for (Funcionarios f : funcionarios) {
            f.aplicarAumento(aumento);
        }

        System.out.println("=== Pagamentos após aumento ===");
        for (Funcionarios f : funcionarios) {
            f.exibirDados();
            System.out.println("---------------------------");
        }
    }
}
