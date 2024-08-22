package AnimalsPOO.animals;

import AnimalsPOO.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    private int quantidadePercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas, double envergaduraAssa,
            double altura, double peso, int quantidadePatas) {
        super(nome, tipoAnimal, idade, habitat, quantidadeAssas, envergaduraAssa, altura, peso, quantidadePatas);
        this.quantidadePercorrida = 0;
        this.quantidadeComida = 0;
        this.quantidadeDormida = 0;
    }

    public int getQuantidadePercorrida() {
        return quantidadePercorrida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public int getQuantidadeDormida() {
        return quantidadeDormida;
    }

    @Override
    public void voar() {
        quantidadePercorrida += 10;
    }

    @Override
    public void comer() {
        quantidadeComida += 5;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 5;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 3;
    }

}
