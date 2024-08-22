package HerancaPolimorfismo.HerancaPoliAnimal.application;

import java.util.ArrayList;
import java.util.List;

import HerancaPolimorfismo.HerancaPoliAnimal.abstracts.Animal;
import HerancaPolimorfismo.HerancaPoliAnimal.entities.Cachorro;
import HerancaPolimorfismo.HerancaPoliAnimal.entities.Cavalo;
import HerancaPolimorfismo.HerancaPoliAnimal.entities.Preguica;
import HerancaPolimorfismo.HerancaPoliAnimal.entities.Veterinario;
import HerancaPolimorfismo.HerancaPoliAnimal.entities.Zoologico;

public class Main {
    public static void main(String[] args) {
        Animal cavalo = new Cavalo("Cavalo", 5);
        Animal cachorro = new Cachorro("Cachorro", 3);
        Animal preguica = new Preguica("Preguica", 2);

        Veterinario vet = new Veterinario();

        List<Animal> list = new ArrayList<>();
        list.add(cavalo);
        list.add(preguica);
        list.add(cachorro);

        for (Animal animal : list) {
            System.out.println(animal.som());
        }

        vet.examinar(preguica);
        vet.examinar(cachorro);
        vet.examinar(cavalo);

        Zoologico zoologico = new Zoologico();
        zoologico.percorrerJaulas();
    }
}
