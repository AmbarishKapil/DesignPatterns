package pattern.abstractfactory;

public class DayTheme implements PlayerThemeFactory{
    @Override
    public Weapon equipWeapon() {
        return new Bow();
    }

    @Override
    public Skin equipSkin() {
        return new RadiantArmour();
    }
}
