package HerancaPolimorfismo.HerancaPoliAnimal.entities;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;
import HerancaPolimorfismo.HerancaPoliAnimal.interfaces.AnimalQueCorre;
import HerancaPolimorfismo.HerancaPoliAnimal.interfaces.AnimalSobeArvore;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
        jaulas[0] = new Cavalo("Cavalo", 5);
        jaulas[1] = new Cachorro("Cachorro", 3);
        jaulas[2] = new Preguica("Preguica", 2);
        jaulas[3] = new Cavalo("Cavalo2", 6);
        jaulas[4] = new Cachorro("Cachorro2", 4);
        jaulas[5] = new Preguica("Preguica2", 3);
        jaulas[6] = new Cavalo("Cavalo3", 7);
        jaulas[7] = new Cachorro("Cachorro3", 5);
        jaulas[8] = new Preguica("Preguica3", 4);
        jaulas[9] = new Cavalo("Cavalo4", 8);
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            System.out.println(animal.getNome() + " " + animal.som());
            if (animal instanceof AnimalQueCorre) {
                ((AnimalQueCorre) animal).correr();
            }

            if (animal instanceof AnimalSobeArvore) {
                ((Preguica) animal).subirArvore();
            }
        }
    }
}