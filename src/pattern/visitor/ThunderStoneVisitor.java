package pattern.visitor;

public class ThunderStoneVisitor implements Visitor{
    @Override
    public void visit(Pokemon pokemon) {
        if(pokemon.getPokemonName().equals("Eevee")){
            pokemon.setPokemonName("Jolteon");
            pokemon.setPokemonType("Thunder");
            pokemon.setHP(4);
            pokemon.setAttack(4);
            pokemon.setSpeed(8);
        }
    }
}
