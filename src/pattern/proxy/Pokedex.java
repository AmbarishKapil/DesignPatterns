package pattern.proxy;

public class Pokedex implements IPokedex{
    String pokemonName;

    public Pokedex(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    @Override
    public String fetchPokemonData() {
        //Makes database query
        return "database query result";
    }

    @Override
    public void addPokemonDataToPokedex(String data) {
        // If pokemon info not in database then Writes pokemon data to database
    }
}
