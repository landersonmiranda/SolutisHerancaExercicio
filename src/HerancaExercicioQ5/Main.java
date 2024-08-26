package HerancaExercicioQ5;

public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario("Ryan Miguel", "Rua Bela Vista", "8766-6505", 342, 1414.00, 7, 6333.00,  4);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodigoSetor());
        System.out.println("Salário base: " + String.format("%.2f", operario.getSalarioBase()));
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor de produção: " + String.format("%.2f", operario.getValorProducao()));
        System.out.println("Comissão: " + String.format("%.2f", operario.getComissao()) + "%");
        System.out.println("Salário líquido: " + String.format("%.2f", operario.calcularSalario()));

        operario.setValorProducao(9442.00);
        operario.setComissao(7.0);
        System.out.println("Valor produção modificado: " + String.format("%.2f", operario.getValorProducao()));
        System.out.println("Comissão modificada: " + String.format("%.2f", operario.getComissao()) + "%");
        System.out.println("Salario: " + String.format("%.2f", operario.calcularSalario()));
    }
}
