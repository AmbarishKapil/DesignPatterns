package pattern.facade;

public class Main {
    public static void main(String[] args) {
        DamageCalculator damageCalculator = new DamageCalculator();
        System.out.println(damageCalculator.getDamage("fire", "water"));
        System.out.println(damageCalculator.getDamage("fire", "grass"));
    }
}
