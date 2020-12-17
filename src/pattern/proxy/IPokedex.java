package pattern.proxy;

public interface IPokedex {
    String fetchPokemonData();
    void addPokemonDataToPokedex(String data);
}