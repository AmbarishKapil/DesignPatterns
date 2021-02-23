package pattern.decorator;

public class HpRestore extends HealthItemDecorator {
    IHealth iHealth;

    public HpRestore(IHealth iHealth) {
        this.iHealth = iHealth;
    }

    @Override
    public void healthItemName() {
        System.out.println("HP Restore");
    }

    @Override
    public double getHealthStats() {
        return iHealth.getHealthStats() + 100d;
    }
}
