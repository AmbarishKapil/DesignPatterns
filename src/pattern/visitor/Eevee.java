package pattern.visitor;

public class Eevee implements Visitor{
    @Override
    public void visit(FireStone fireStone) {
        System.out.println("Eevee is evolving...");
        System.out.println("Eevee evolved to Flareon!");
    }

    @Override
    public void visit(WaterStone waterStone) {
        System.out.println("Eevee is evolving...");
        System.out.println("Eevee evolved to Vaporeon!");
    }
}
