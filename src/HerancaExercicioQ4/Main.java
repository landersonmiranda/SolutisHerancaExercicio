package HerancaExercicioQ4;

public class Main {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Isaura Alice", "Rua São João", "8978-4277", 333, 12987.33, 21.0, 2133.00);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do setor: " + administrador.getCodigoSetor());
        System.out.println("Salário base: " + String.format("%.2f", administrador.getSalarioBase()));
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de custo: " + String.format("%.2f", administrador.getAjudaDeCusto()));
        System.out.println("Salário líquido: " + String.format("%.2f", administrador.calcularSalario()));

        administrador.setAjudaDeCusto(3342.33);
        System.out.println("Ajuda de custo atualizada: " + String.format("%.2f", administrador.getAjudaDeCusto()));
        System.out.println("Novo salário : " + String.format("%.2f", administrador.calcularSalario()));

        administrador.setImposto(13);
        System.out.println("Imposto atualizado: " + String.format("%.2f", administrador.getImposto()));
        System.out.println("Novo salário : " + String.format("%.2f", administrador.calcularSalario()));
    }
}
