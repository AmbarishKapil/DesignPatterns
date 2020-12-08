package pattern.abstractfactory;

public class ShadowArmour implements Skin{
    @Override
    public String skinName() {
        return "Shadow Armour";
    }

    @Override
    public double skinDefence() {
        return 2.49d;
    }
}
