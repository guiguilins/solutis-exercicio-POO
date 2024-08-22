package Heranca.tests;

import Heranca.entities.Fornecedor;

public class TestFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("João", "Rua 1", "123456789", 1000, 500);

        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco() + ", Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor de crédito: R$" + String.format("%.2f", fornecedor.getValorCredito()));
        System.out.println("Valor da dívida: R$" + String.format("%.2f", fornecedor.getValorDivida()));
        System.out.println("Salario: R$" + String.format("%.2f", fornecedor.obterSaldo()));

    }
}
