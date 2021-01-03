package pattern.prototype;

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
