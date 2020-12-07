package pattern.decorator;

public class Shield implements IHealth{
    String healthItemName;
    private double totalHP = 1d;
    private double totalDefence = 1d;

    @Override
    public void healthItemName() {
        healthItemName = "shield";
    }

    private void healthItemContribution() {
        this.totalDefence += 1.99d;
    }

    @Override
    public double getHealthStats() {
        healthItemContribution();
        return this.totalHP * this.totalDefence;
    }
}
