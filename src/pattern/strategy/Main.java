package pattern.strategy;

import java.util.ArrayList;

/**
 * This is an implementation of the strategy design pattern
 *
 * Here we are designing a RPG, where there are various characters. Two things that the
 * character needs to do is Move and have an elemental attack. So to incorporate various
 * movement and elemental behaviour, we have written a strategy pattern. The first interface
 * IMovementBehaviour defines the movement behavior of a character, for now we have defined
 * the classes(that implement IMovementBehaviour) Run, Fly, Crawl. And implementing the
 * interface IElementBehaviour we have the classes Fire, Ice and Wind. The advantage of using
 * a strategy pattern here is that if we need to add a new movement behaviour or a elemental
 * behaviour for a character, we can simply extend IMovementBehaviour/IElementBehaviour
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Avatar> avatars = new ArrayList<>();
        avatars.add(new Avatar("Mr. Magma", 0.99d, new Crawl(), new Fire()));
        avatars.add(new Avatar("Arctic Wolf", 4.99d, new Run(), new Ice()));
        avatars.add(new Avatar("Aerial Trooper", 3.99d, new Fly(),new Wind()));

        for(int i=0;i<avatars.size();i++){
            System.out.println(avatars.get(i).moveCharacter());
            System.out.println(avatars.get(i).attack());
            System.out.println();
        }
    }
}
