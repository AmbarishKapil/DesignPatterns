package pattern.decorator;

public class Immortality extends HealthItemDecorator{
    IHealth iHealth;

    public Immortality(IHealth iHealth) {
        this.iHealth = iHealth;
    }

    @Override
    public void healthItemName() {
        System.out.println("Immortality");
    }

    @Override
    public double getHealthStats() {
        return iHealth.getHealthStats()*2;
    }
}
