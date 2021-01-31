package pattern.abstractfactory;

/**
 * This is an implementation of the Abstract factory design pattern
 *
 * Here we have a situation where we need to spawn a player, with appropriate weapon and armor
 * depending on the time of day the mission takes place. Thus we have created a PlayerThemeFactory
 * as an abstract factory which produces two factories: DayTheme and NightTheme and both of them
 * return their unique combination of weapon and armor.
 */
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
