package HerancaExercicioQ6;
public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Lasmin Miranda", "rua São Pedro", "8701-2894", 342, 7893, 16, 24000, 7);


        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário base: " + String.format("%.2f", vendedor.getSalarioBase()));
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + String.format("%.2f", vendedor.getValorVendas()));
        System.out.println("Comissão: " + String.format("%.2f", vendedor.getComissao()) + "%");
        System.out.println("Salário líquido: " + String.format("%.2f", vendedor.calcularSalario()));

        vendedor.setValorVendas(20000.00);
        vendedor.setComissao(4);
        System.out.println("Valor vendas modificado: " + String.format("%.2f", vendedor.getValorVendas()));
        System.out.println("Comissão modificada: " + String.format("%.2f", vendedor.getComissao()) + "%");
        System.out.println("Salário: " + String.format("%.2f", vendedor.calcularSalario()));
    }
}
