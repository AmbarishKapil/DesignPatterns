package pattern.prototype;

/**
 * This is an implementation of the prototype design pattern
 *
 * Here we are designing a game where we need to spawn multiple elves, we can copy one
 * elf from another, but that would be a shallow copy and IPhysicalStats would be of the
 * same reference for multiple elves. Thus, to solve this issue, we have implemented the
 * prototype design pattern. We have a Elf class which has private fields for name and
 * IPhysicalStats and it implements the Cloneable interface. We have written a clone method
 * for the Elf class so that the elf object Buddy can act as a prototype for all the other
 * Elf objects that spawns later.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Elf buddy = new Elf("Buddy", new PhysicalStats(1.4d,33.3d));
        System.out.println(buddy);

        Elf dobby = buddy.clone();

        dobby.setName("Dobby");
        dobby.setPhysicalStats(2.1d, 11.3d);
        System.out.println(dobby);

        System.out.println(buddy);
    }
}
