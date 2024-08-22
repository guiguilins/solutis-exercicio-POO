package HerancaPolimorfismo.HerancaPoliAnimal.entities;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;
import HerancaPolimorfismo.HerancaPoliAnimal.interfaces.AnimalQueCorre;

public class Cavalo extends Animal implements AnimalQueCorre{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public String som() {
        return "Relinchar";
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " correu");
    }

}
