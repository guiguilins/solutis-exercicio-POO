package HerancaPolimorfismo.HerancaPoliEmpresa.funcionarios;

import HerancaPolimorfismo.HerancaPoliEmpresa.comissoes.Gerente;
import HerancaPolimorfismo.HerancaPoliEmpresa.comissoes.Supervisor;
import HerancaPolimorfismo.HerancaPoliEmpresa.comissoes.Vendedor;
import HerancaPolimorfismo.HerancaPoliEmpresa.empresa.EnsinoBasico;
import HerancaPolimorfismo.HerancaPoliEmpresa.empresa.EnsinoMedio;
import HerancaPolimorfismo.HerancaPoliEmpresa.empresa.Graduado;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        String[] nomes = {"Leonardo", "Guilherme", "Junior", "Fabricio", "Alisson",
                "Roger", "Carlos", "Alex", "Maria", "Vinicius"};

        double salarioTotal = 0;
        double salarioBasico = 0, salarioMedio = 0, salarioSuperior = 0;

        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                funcionarios[i] = new EnsinoBasico(nomes[i] , "" + i);
            } else if (i < 8) {
                funcionarios[i] = new EnsinoMedio(nomes[i], "" + i);
            }
            else {
                funcionarios[i] = new Graduado(nomes[i], "" + i);
            }
        }

        double custo = 0.0;
        for (Funcionario a: funcionarios) {
            custo += a.calcularRendaTotal();
            System.out.println(a);
            System.out.println("--------");
        }

        System.out.println("Custo total da empresa: " + custo);
      
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i < 1) {
                funcionarios[i] = new Gerente(nomes[i] , "" + i);
            } else if (i < 3) {
                funcionarios[i] = new Supervisor(nomes[i], "" + i);
            }
            else {
                funcionarios[i] = new Vendedor(nomes[i], "" + i);
            }
        }

        custo = 0.0;
        for (Funcionario a: funcionarios) {
            custo += a.calcularRendaTotal();
            System.out.println(a);
            System.out.println("--------");
        }
        System.out.println("Custo total da empresa: R$" + custo);
    }
}