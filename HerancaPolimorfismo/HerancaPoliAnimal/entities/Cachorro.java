package HerancaPolimorfismo.HerancaPoliAnimal.entities;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;
import HerancaPolimorfismo.HerancaPoliAnimal.interfaces.AnimalQueCorre;

public class Cachorro extends Animal implements AnimalQueCorre {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public String som() {
        return "Latir";
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " correu");
    }

}
