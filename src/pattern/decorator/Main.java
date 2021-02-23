package pattern.decorator;

/**
 * This is an implementation of the decorator pattern
 *
 * Here we take a scenario of designing an open world game where the character can stack
 * their defence items. We have a common Interface IHealth for all defence items and a
 * base class Armour with which the character starts, we also have an abstract class
 * HealthItemDecorator which every defence decorator needs to extend. We define two decorators
 * HpRestore and Immortality which has special effects and alters the character's defence
 * behaviour.
 */
public class Main {
    public static void main(String[] args) {
        IHealth superDefence = new Immortality(new HpRestore(new Armour()));
        System.out.println(superDefence.getHealthStats());
    }
}
