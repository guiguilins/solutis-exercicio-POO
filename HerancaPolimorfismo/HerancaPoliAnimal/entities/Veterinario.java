package HerancaPolimorfismo.HerancaPoliAnimal.entities;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.getNome());
        System.out.println(animal.som());
    }
}
