package AnimalsPOO.animals;

import AnimalsPOO.abstracts.AnimalMarinhoAB;

public class Peixe extends AnimalMarinhoAB {
  private int quantidadePercorrida;
  private int quantidadeComida;
  private int quantidadeDormida;

  public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
    super(nome, tipoAnimal, idade, habitat, altura, peso);
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
  public void nadar() {
    quantidadePercorrida += 5;
  }

  @Override
  public void comer() {
    quantidadeComida += 5;
  }

  @Override
  public void moverse() {
    quantidadePercorrida += 7;
  }

  @Override
  public void dormir() {
    quantidadeDormida += 4;
  }

}
