package HerancaPolimorfismo.HerancaPoliAnimal.entities;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;
import HerancaPolimorfismo.HerancaPoliAnimal.interfaces.AnimalSobeArvore;

public class Preguica extends Animal implements AnimalSobeArvore {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public String som() {
        return "Rugir";
    }

    @Override
    public void subirArvore() {
       System.out.println(getNome() + " subiu na árvore");
    }

}
