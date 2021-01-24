package pattern.visitor;

public class FireStoneVisitor implements Visitor{
    @Override
    public void visit(Pokemon pokemon) {
        if(pokemon.getPokemonName().equals("Eevee")){
            pokemon.setPokemonName("Flareon");
            pokemon.setPokemonType("Fire");
            pokemon.setHP(4);
            pokemon.setAttack(8);
            pokemon.setSpeed(4);
        }
    }
}
