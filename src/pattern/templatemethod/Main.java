package pattern.templatemethod;

public class Main {
    public static void main(String[] args) {
        WeaponDemoAnimation ak47 = new AK47Animation();
        WeaponDemoAnimation deagle = new DesertEagleAnimation();

        ak47.weaponAnimation();
        deagle.weaponAnimation();
    }
}
