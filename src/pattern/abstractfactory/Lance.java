package pattern.abstractfactory;

public class Lance implements Weapon{
    @Override
    public String weaponName() {
        return "Lance";
    }

    @Override
    public double weaponDamage() {
        return 3.99d;
    }
}
