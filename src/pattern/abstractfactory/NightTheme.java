package pattern.abstractfactory;

public class NightTheme implements PlayerThemeFactory{
    @Override
    public Weapon equipWeapon() {
        return new Sword();
    }

    @Override
    public Skin equipSkin() {
        return new ShadowArmour();
    }
}
