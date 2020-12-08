package pattern.factorymethod;

public class Lord implements MainCreep{
    @Override
    public void creepName() {
        System.out.println("Lord");
    }

    @Override
    public double creepBasicDamage() {
        return 10.99d;
    }
}
