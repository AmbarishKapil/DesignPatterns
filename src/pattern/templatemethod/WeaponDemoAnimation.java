package pattern.templatemethod;

public abstract class WeaponDemoAnimation {
    public final void weaponAnimation(){
        System.out.println("Enemy appears...drawing weapon!");
        drawWeaponAnimation();
        System.out.println("Firing at enemy!");
        useWeaponAnimation();
        System.out.println("Time to reload!");
        reloadWeaponAnimation();
    }

    public abstract void drawWeaponAnimation();
    public abstract void useWeaponAnimation();
    public abstract void reloadWeaponAnimation();
}
