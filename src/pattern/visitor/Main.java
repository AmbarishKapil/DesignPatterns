package pattern.visitor;

/**
 * This is an implementation of the visitor design pattern
 *
 * Here we are programming the branched evolution for a pokemon game. We have a fixed
 * number of stones and they act differently when applied to different pokemon. Here we
 * have kept pokemon as Visitor since there are so many pokemon getting added and they
 * each have a evolution when interacted with a particular stone. Thus with addition of
 * new pokemon, we do not have to modify the, already working, stone classes and risk
 * breaking anything. We can just simply make the pokemon implement Visitor and override
 * visit for each of the stones to handle the evolution logic.
 */
public class Main {
    public static void main(String[] args) {
        Visitor poliwhirl = new Poliwhirl();
        Visitor eevee = new Eevee();

        Stone fireStone = new FireStone();
        fireStone.accept(eevee);
        fireStone.accept(poliwhirl);

        Stone waterStone = new WaterStone();
        waterStone.accept(eevee);
        waterStone.accept(poliwhirl);
    }
}
