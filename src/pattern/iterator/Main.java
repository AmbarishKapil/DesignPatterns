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
