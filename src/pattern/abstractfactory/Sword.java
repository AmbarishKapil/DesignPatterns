package pattern.abstractfactory;

public class Sword implements Weapon{
    @Override
    public String weaponName() {
        return "Sword";
    }

    @Override
    public double weaponDamage() {
        return 5.99d;
    }
}
