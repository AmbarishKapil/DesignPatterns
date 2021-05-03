package pattern.visitor;

public class Poliwhirl implements Visitor{
    @Override
    public void visit(FireStone fireStone) {
        System.out.println("Does not effect Poliwhirl.");
    }

    @Override
    public void visit(WaterStone waterStone) {
        System.out.println("Poliwhirl is evolving...");
        System.out.println("Poliwhirl evolved to Poliwrath!");
    }
}
