package pattern.templatemethod;

public class DesertEagleAnimation extends WeaponDemoAnimation{
    @Override
    public void drawWeaponAnimation() {
        System.out.println("Rendering Desert Eagle drawing animation");
    }

    @Override
    public void useWeaponAnimation() {
        System.out.println("Rendering Desert Eagle firing animation");
    }

    @Override
    public void reloadWeaponAnimation() {
        System.out.println("Rendering Desert Eagle reloading animation");
    }
}
