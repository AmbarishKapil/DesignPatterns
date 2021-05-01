package pattern.templatemethod;

/**
 * This is an implementation of the template method design pattern
 *
 * Here we are programming the preview of the guns of a FPS game. The user can select any
 * gun and it would show a preview of the gun. Now for the preview we need to follow a template.
 * First we need to show the user pulling out the gun and then firing the gun at a target
 * and finally reloading the gun. Here the sequence is important to maintain. To solve this
 * we have employed the template method design pattern where we have an abstract WeaponDemoAnimation
 * class and have a implemented method weaponAnimation() which sets the template. The rest of the
 * methods are abstract and needs to overridden by the classes extending WeaponDemoAnimation.
 * Here we have two classes AK47Animation and DesertEagleAnimation that extends the abstract
 * class and overrides the abstract methods which eventually gets plugged to the template method.
 */
public class Main {
    public static void main(String[] args) {
        WeaponDemoAnimation ak47 = new AK47Animation();
        WeaponDemoAnimation deagle = new DesertEagleAnimation();

        ak47.weaponAnimation();
        deagle.weaponAnimation();
    }
}
