package AnimalsPOO.abstracts;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected int quantidadeAssas;
    protected double envergaduraAssa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas,
            double envergaduraAssa, double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
        this.quantidadeAssas = quantidadeAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public abstract void voar();

}
