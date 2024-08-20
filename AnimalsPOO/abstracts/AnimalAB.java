package AnimalsPOO.abstracts;

import AnimalsPOO.interfaces.AnimalIF;

public abstract class AnimalAB implements AnimalIF {

    protected int quantidadePatas;
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura,
            double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();

}