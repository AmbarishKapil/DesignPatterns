package pattern.abstractfactory;

public class Bow implements Weapon{
    @Override
    public String weaponName() {
        return "Bow";
    }

    @Override
    public double weaponDamage() {
        return 1.99d;
    }
}
