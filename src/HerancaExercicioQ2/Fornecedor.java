package HerancaExercicioQ2;

import HerancaExercicioQ1.Pessoa;
public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }


    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    //fiz um set incremental, para somar no montante da dívida e não só substituir
    public void setValorDivida(double valorDivida) {
        this.valorDivida += valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

}
