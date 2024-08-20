package AnimalsPOO.application;

import AnimalsPOO.Animals.Cachorro;
import AnimalsPOO.Animals.Elefante;
import AnimalsPOO.Animals.Gato;
import AnimalsPOO.Animals.Leao;
import AnimalsPOO.Animals.Peixe;
import AnimalsPOO.Animals.Pombo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Doméstico", 0.5, 20);
        Gato gato = new Gato("Miau", null, 3, "Doméstico", 0, 0.3, 5);
        Peixe peixe = new Peixe("Nemo", null, 1, "Aquário", 0.1, 0.2);
        Pombo pombo = new Pombo("Pombinho", null, 2, "Urbano", 2, 0.5, 0.3, 0.4, 0);
        Leao leao = new Leao("Simba", null, 7, "Selva", 0, 1.2, 190);
        Elefante elefante = new Elefante("Dumbo", null, 10, "Selva", 0, 3.0, 5000);

        cachorro.moverse();
        gato.moverse();
        peixe.nadar();
        pombo.voar();
        leao.dormir();
        elefante.comer();

        System.out.println("Cachorro: " + cachorro.getQuantidadePercorrida());
        System.out.println("Gato: " + gato.getQuantidadePercorrida());
        System.out.println("Peixe: " + peixe.getQuantidadePercorrida());
        System.out.println("Pombo: " + pombo.getQuantidadePercorrida());
        System.out.println("Leao: " + leao.getQuantidadeDormida());
        System.out.println("Elefante: " + elefante.getQuantidadeComida());
    }
}
