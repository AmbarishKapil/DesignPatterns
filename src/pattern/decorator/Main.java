package pattern.decorator;

public class Main {
    public static void main(String[] args) {
        IHealth superDefence = new Immortality(new HpRestore(new Armour()));
        System.out.println(superDefence.getHealthStats());
    }
}
