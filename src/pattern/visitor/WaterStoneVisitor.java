package pattern.visitor;

public class WaterStoneVisitor implements Visitor{
    @Override
    public void visit(Pokemon pokemon) {
        if(pokemon.getPokemonName().equals("Eevee")){
            pokemon.setPokemonName("Vaporeon");
            pokemon.setPokemonType("Water");
            pokemon.setHP(8);
            pokemon.setAttack(4);
            pokemon.setSpeed(4);
        }
    }
}
