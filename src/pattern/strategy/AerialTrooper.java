package pattern.strategy;

public class AerialTrooper extends Avatar {
    public AerialTrooper() {
        super("Aerial Trooper", 3.99d, new Fly(),new Wind());
    }


    @Override
    protected void firstSkill() {
        System.out.println("Aerial Combat, damage +100");
    }

    @Override
    protected void secondSkill() {
        System.out.println("Tail Wind, escapes the fight, speed +200");
    }

    @Override
    protected void ultimateSkill() {
        System.out.println("Jet Blast, damage +200, speed +50");
    }
}
