package pattern.strategy;

public class MrMagma extends Avatar{
    public MrMagma() {
        super("Mr. Magma", 0.99d, new Crawl(), new Fire());
    }

    @Override
    protected void firstSkill() {
        System.out.println("Spits Magma, damage +100");
    }

    @Override
    protected void secondSkill() {
        System.out.println("Hardens,magma gets cooled, defence +100");
    }

    @Override
    protected void ultimateSkill() {
        System.out.println("Magma wave, Sweeps all the opponents in a wave of magma, damage +300, speed +50");
    }
}
