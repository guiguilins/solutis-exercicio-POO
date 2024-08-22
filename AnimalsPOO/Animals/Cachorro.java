package AnimalsPOO.animals;

import AnimalsPOO.abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    private int quantidadePercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura,
            double peso) {
        super(nome, tipoAnimal, idade, habitat, quantidadePatas, altura, peso);
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
    public void comer() {
        quantidadeComida += 1;
    }

    @Override
    public void moverse() {
        quantidadePercorrida += 10;
    }

    @Override
    public void dormir() {
        quantidadeDormida += 8;
    }

}
