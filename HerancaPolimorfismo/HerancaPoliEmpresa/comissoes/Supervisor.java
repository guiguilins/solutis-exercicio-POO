package HerancaPolimorfismo.HerancaPoliEmpresa.comissoes;

import HerancaPolimorfismo.HerancaPoliEmpresa.empresa.EnsinoMedio;

public class Supervisor extends EnsinoMedio {


    public Supervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(600.0);
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRenda Total: R$" + calcularRendaTotal() + "\nComissão: " + getComissao();
    }
}