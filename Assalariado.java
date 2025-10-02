package com.mycompany.funcionarios;

public class Assalariado extends Funcionarios {
    private double salarioMensal;

    public Assalariado(String nome, String cpf, String endereco, String telefone, String setor, double salarioMensal) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(double salarioMensal) { this.salarioMensal = salarioMensal; }

    
    @Override
    public double calcularPagamento() {
        return salarioMensal;
    }

    @Override
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * percentual / 100;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário Mensal: " + salarioMensal);
        System.out.println("Pagamento: " + calcularPagamento());
    }
}
