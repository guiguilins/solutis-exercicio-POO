package AnimalsPOO.Animals;

import AnimalsPOO.abstracts.AnimalTerrestreAB;

public class Cachorro extends AnimalTerrestreAB {

    private int quantidadePercorrida;
    private int quantidadeComida;
    private int quantidadeDormida;

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, 4, altura, peso);
        this.quantidadePercorrida = 0;
        this.quantidadeComida = 0;
        this.quantidadeDormida = 0;
    }

    public int getQuantidadePercorrida() {
        return quantidadePercorrida;
    }

    public void setQuantidadePercorrida(int quantidadePercorrida) {
        this.quantidadePercorrida = quantidadePercorrida;
    }

    public int getQuantidadeComida() {
        return quantidadeComida;
    }

    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }

    public int getQuantidadeDormida() {
        return quantidadeDormida;
    }

    public void setQuantidadeDormida(int quantidadeDormida) {
        this.quantidadeDormida = quantidadeDormida;
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
