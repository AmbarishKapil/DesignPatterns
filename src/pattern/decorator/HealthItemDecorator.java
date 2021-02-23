package pattern.decorator;

public abstract class HealthItemDecorator implements IHealth{
    public void healthItemName(){
        System.out.println("defence decorator item");
    }

    public abstract double getHealthStats();
}
