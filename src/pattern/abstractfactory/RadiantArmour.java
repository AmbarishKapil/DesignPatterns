package pattern.abstractfactory;

public class RadiantArmour implements Skin{
    @Override
    public String skinName() {
        return "Radiant Armour";
    }

    @Override
    public double skinDefence() {
        return 1.99d;
    }
}
