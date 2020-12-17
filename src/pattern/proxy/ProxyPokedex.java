package pattern.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyPokedex implements IPokedex{
    public static final Map<String, String> pokemonInfo = new HashMap();

    String pokemonName;

    public ProxyPokedex(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    @Override
    public String fetchPokemonData() {
        return pokemonInfo.get(this.pokemonName);
    }

    @Override
    public void addPokemonDataToPokedex(String data){
        pokemonInfo.put(this.pokemonName, data);

        IPokedex pokedex = new Pokedex(this.pokemonName);
        pokedex.addPokemonDataToPokedex(data);
    }
}
