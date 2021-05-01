package pattern.nullobject;

import java.lang.reflect.Field;

/**
 * This is an implementation of the Null Object Design Pattern
 *
 * Here we are designing a simple game like super-mario. We can move the character but if
 * the player gets stunned the movement keys gets disabled. Here we design a movement
 * strategy(Strategy Pattern) and also write a Null strategy for the stunning case. The player
 * movement is set to Null Movement Behaviour in case we do not want the player to move.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Math.ulp(2.45f));
        Player player = new Player();
        System.out.println(player.movePlayer());
        player.stunPlayer();
        System.out.println(player.movePlayer());
    }
}
