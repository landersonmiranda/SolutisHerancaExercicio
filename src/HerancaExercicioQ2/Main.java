package HerancaExercicioQ2;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Padaria da Casa", "Rua da romã", "4444-2222", 5437.90, 2927.42);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: " + String.format("%.2f", fornecedor.getValorCredito()));
        System.out.println("Dívida: " + String.format("%.2f", fornecedor.getValorDivida()));
        System.out.println("Saldo: " + String.format("%.2f", fornecedor.obterSaldo()));
        fornecedor.setValorDivida(987.37);
        System.out.println("Nova dívida: " + String.format("%.2f", fornecedor.getValorDivida()));
        System.out.println("Novo saldo: " + String.format("%.2f", fornecedor.obterSaldo()));

    }
}
