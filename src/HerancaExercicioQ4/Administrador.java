package HerancaExercicioQ4;

import HerancaExercicioQ3.Empregado;

public class Administrador extends Empregado {

    private double ajudaDeCusto;
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario(){
        double impostoParaCalculo = getImposto() / 100;
        return (getSalarioBase() - (getSalarioBase()*impostoParaCalculo)) + ajudaDeCusto ;
    }

}
