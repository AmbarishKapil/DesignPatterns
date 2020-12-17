package pattern.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wild pokemon appeared...");

        IPokedex pokedex = new ProxyPokedex("Pikachu");
        String pokemonData = pokedex.fetchPokemonData();
        if(pokemonData != null){
            System.out.println("Pokemon Data : " + pokemonData);
        }

        System.out.println("what will you do:\n1. Update pokedex Info\n2. Flee");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                pokedex.addPokemonDataToPokedex("pokemon data");
                break;
            default:
                return;
        }
    }
}
