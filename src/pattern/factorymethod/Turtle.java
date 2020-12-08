package pattern.factorymethod;

public class Turtle implements MainCreep{
    @Override
    public void creepName() {
        System.out.println("Turtle");
    }

    @Override
    public double creepBasicDamage() {
        return 4.99d;
    }
}
