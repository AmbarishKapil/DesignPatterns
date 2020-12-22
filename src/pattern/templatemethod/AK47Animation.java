package pattern.templatemethod;

public class AK47Animation extends WeaponDemoAnimation{
    @Override
    public void drawWeaponAnimation() {
        System.out.println("Rendering AK47 drawing animation");
    }

    @Override
    public void useWeaponAnimation() {
        System.out.println("Rendering AK47 firing animation");
    }

    @Override
    public void reloadWeaponAnimation() {
        System.out.println("Rendering AK47 reloading animation");
    }
}
