package pattern.iterator;

import pattern.abstractfactory.Sword;

import java.util.Scanner;

/**
 * This is an implementation of the observer pattern
 *
 * Here we are coding a weapon choosing interface for an Assassins Creed game. We have designed
 * two interfaces AbstractInventory and AbstractIterator and have implemented them in classes
 * WeaponInventory and WeaponIterator. We also have a Weapons class to store weapon related info.
 * The implementation is like a circular list where the player can move forward, move back or
 * lock on the current weapon.
 *
 * IN THE ITERATOR PATTERN WE DECOUPLE THE ALGORITHM FROM THE CONTAINER. This means that we can store the data in
 * any data structure, be it trees, graphs, linked lists etc. but we are not concerned with that. We don't want to know
 * which is the underlying data structure, cause if we do we need to handle the traversal for that specific data structure,
 * so if we had a tree, we would have to do tree.left() or if it was a linked list we need to list.next(), which is
 * introducing unneeded complexity. What we instead do is say, WE ONLY SPEAK THE ITERATOR LANGUAGE. We just know, moveNext()
 * movePrevious() and giveCurrent(). And how these are implemented is not our concern, the inner implementation can even
 * change if a better data structure comes along, we aren't concerned at the least because it's not breaking our code.
 */
public class Main {
    public static void main(String[] args) {
        AbstractInventory weaponInventory = new WeaponInventory();
        AbstractIterator weaponIterator = weaponInventory.createIterator();

        weaponInventory.addItemToInventory(new Weapon(3.99d, "Sword"));
        weaponInventory.addItemToInventory(new Weapon(4.99d, "Axe"));
        weaponInventory.addItemToInventory(new Weapon(5.99d, "Hidden Blade"));
        weaponInventory.addItemToInventory(new Weapon(2.99d, "Bow"));

        System.out.println("1. Move forward\n2. Move backward\n3. Equip selected weapon");

        Scanner sc = new Scanner(System.in);

        while (true){
            int option = sc.nextInt();
            switch (option){
                case 1:
                    weaponIterator.moveNext();
                    break;
                case 2:
                    weaponIterator.movePrevious();
                    break;
                case 3:
                    Weapon w = weaponIterator.giveCurrent();
                    System.out.println(w.getWeaponName());
                    System.out.println(w.getDamageStats());
                    break;
                default:
                    sc.close();
                    return;
            }
        }
    }
}
