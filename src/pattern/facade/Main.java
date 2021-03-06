package pattern.facade;

/**
 * This is an implementation of the facade pattern
 *
 * Here we a designing a damage module for a pokemon simulator. When calculating damage,
 * there are a lot of things to take into consideration. pokemon base stats, crit hit rato,
 * type advantage etc. all play a role. Thus it is a messy UML structure and if someone jsut
 * needs to calculate the damage it would be confusing to take everything into account.
 * Thus we have separated out a class called DamageCalculator that abstracts away all the
 * complicated dependencies and associations of the underlying classes like CritHit, PokemonStats,
 * and TypeEffect. So if anyone wants to calculate the damage for the battle module they can
 * use the facade class DamageCalculator.
 */
public class Main {
    public static void main(String[] args) {
        DamageCalculator damageCalculator = new DamageCalculator();
        System.out.println(damageCalculator.getDamage("fire", "water"));
        System.out.println(damageCalculator.getDamage("fire", "grass"));
    }
}
