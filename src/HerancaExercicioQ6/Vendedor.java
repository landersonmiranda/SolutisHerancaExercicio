package HerancaExercicioQ6;

import HerancaExercicioQ3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double impostoParaCalculo = getImposto() / 100;
        double salarioLiquido = getSalarioBase() - (getSalarioBase() * impostoParaCalculo);
        double valorComissao = (valorVendas * comissao / 100);
        return salarioLiquido + valorComissao;
    }
}
