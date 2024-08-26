package HerancaExercicioQ3;

public class Main {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("Landerson Miranda", "Rua da romã", "8510-3427", 142, 8397.42, 27);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: " + String.format("%.2f", empregado.getSalarioBase()));
        System.out.println("Porcentagem do imposto: " + empregado.getImposto() + "%");
        System.out.println("salário líquido: " + String.format("%.2f", empregado.calcularSalario()));

        empregado.setSalarioBase(6000.00);
        empregado.setImposto(13);
        System.out.println("Mudando o salário base e o imposto: " + String.format("%.2f", empregado.getSalarioBase()));
        System.out.println("calculando novo salário líquido: " + String.format("%.2f", empregado.calcularSalario()));
    }
}
