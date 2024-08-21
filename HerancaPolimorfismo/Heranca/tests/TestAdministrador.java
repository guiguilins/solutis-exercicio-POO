package HerancaPolimorfismo.Heranca.tests;

import HerancaPolimorfismo.Heranca.entities.Administrador;

public class TestAdministrador {
    public static void main(String[] args) {
        Administrador adm = new Administrador("João", "Rua 1", "123456789", 1, 2000, 15, 200);

        System.out.println("Nome: " + adm.getNome());
        System.out.println("Endereço: " + adm.getEndereco() + ", Telefone: " + adm.getTelefone());
        System.out.println("Código do setor: " + adm.getCodigoSetor());
        System.out.println("Salário base: R$" + String.format("%.2f", adm.getSalarioBase()));
        System.out.println("Imposto: " + adm.getImposto() + "%");
        System.out.println("Ajuda de custo: R$" + String.format("%.2f", adm.getAjudaDeCusto()));
        System.out.println("Salário: R$" + String.format("%.2f", adm.calcularSalario()));
    }
}
