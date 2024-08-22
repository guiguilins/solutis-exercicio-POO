package Heranca.tests;

import Heranca.entities.Empregado;

public class TestEmpregado {

    public static void main(String[] args) {
        Empregado empregado = new Empregado("João", "Rua 1", "123456789", 1, 1000, 10);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco() + ", Telefone: " + empregado.getTelefone());
        System.out.println("Código do setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: R$" + String.format("%.2f", empregado.getSalarioBase()));
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário: R$" + String.format("%.2f", empregado.calcularSalario()));
    }

}
