package HerancaPolimorfismo.HerancaPoliEmpresa.empresa;

public class EnsinoMedio extends EnsinoBasico {
    private String escolaMédio;

    public EnsinoMedio(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        setRendaBasica(getRendaBasica() * 1.5);
    }

    public String getEscolaMédio() {
        return escolaMédio;
    }

    public void setEscolaMédio(String escolaMédio) {
        this.escolaMédio = escolaMédio;
    }

}