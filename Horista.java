package com.mycompany.funcionarios;

public class Horista extends Funcionarios {
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, String endereco, String telefone, String setor, int horasTrabalhadas, double valorHora) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void aplicarAumento(double percentual) {
        valorHora += valorHora * percentual / 100;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.println("Valor da Hora: " + valorHora);
        System.out.println("Pagamento: " + calcularPagamento());
    }
}
