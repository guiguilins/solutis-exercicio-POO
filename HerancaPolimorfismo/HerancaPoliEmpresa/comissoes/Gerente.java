package HerancaPolimorfismo.HerancaPoliEmpresa.comissoes;

import HerancaPolimorfismo.HerancaPoliEmpresa.empresa.Graduado;

public class Gerente extends Graduado {

    public Gerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setComissao(1500.0);
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() + getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nRenda Total: R$" + calcularRendaTotal() + "\nComissão: R$" + getComissao();
    }
}