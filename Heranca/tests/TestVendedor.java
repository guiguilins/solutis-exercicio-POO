package Heranca.tests;

import Heranca.entities.Vendedor;

public class TestVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João", "Rua 1", "123456789", 1, 1000, 10, 10000, 5);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco() + ", Telefone: " + vendedor.getTelefone());
        System.out.println("Código do setor: " + vendedor.getCodigoSetor());
        System.out.println("Valor vendas: R$" + String.format("%.2f", vendedor.getValorVendas()));
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário: R$" + String.format("%.2f", vendedor.calcularSalario()));
    }
}
