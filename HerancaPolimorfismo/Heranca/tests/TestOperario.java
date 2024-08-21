package HerancaPolimorfismo.Heranca.tests;

import HerancaPolimorfismo.Heranca.entities.Operario;

public class TestOperario {
    public static void main(String[] args) {
        
        Operario operario = new Operario("Joao", "Rua 1", "123456789", 1, 1000, 10, 1000, 10);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco() + ", Telefone: " + operario.getTelefone());
        System.out.println("Código do setor: " + operario.getCodigoSetor());
        System.out.println("Valor produção: R$" + String.format("%.2f", operario.getValorProducao()));
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário: R$" + String.format("%.2f", operario.calcularSalario()));
    }
}
