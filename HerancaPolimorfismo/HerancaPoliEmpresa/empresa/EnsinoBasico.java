package HerancaPolimorfismo.HerancaPoliEmpresa.empresa;

import HerancaPolimorfismo.HerancaPoliEmpresa.funcionarios.Funcionario;

public class EnsinoBasico extends Funcionario {
    private String escola;

    public EnsinoBasico(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setRendaBasica(getRendaBasica() * 1.1);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

}