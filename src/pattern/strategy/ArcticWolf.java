package pattern.strategy;

public class ArcticWolf extends Avatar{
    public ArcticWolf() {
        super("Arctic Wolf", 4.99d, new Run(), new Ice());
    }

    @Override
    protected void firstSkill() {
        System.out.println("Silver Claw, damage +50");
    }

    @Override
    protected void secondSkill() {
        System.out.println("Hyper fang, damage +100");
    }

    @Override
    protected void ultimateSkill() {
        System.out.println("WereWolf, damage +450, speed +300");
    }
}