package pattern.abstractfactory;

public class Main {
    public static void main(String[] args) {
        PlayerThemeFactory playerThemeFactory = new DayTheme();
        themeInfo(playerThemeFactory);

        playerThemeFactory = new NightTheme();
        themeInfo(playerThemeFactory);
    }

    public static void themeInfo(PlayerThemeFactory playerThemeFactory) {
        System.out.println(playerThemeFactory.equipSkin().skinName());
        System.out.println(playerThemeFactory.equipSkin().skinDefence());
        System.out.println(playerThemeFactory.equipWeapon().weaponName());
        System.out.println(playerThemeFactory.equipWeapon().weaponDamage());
    }
}
