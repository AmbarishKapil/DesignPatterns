package pattern.facade;

public class DamageCalculator {
    public double getDamage(String attacker, String receiver){
        double totalDamage = 0d;

        PokemonStats pokemonStats = new PokemonStats();
        totalDamage = pokemonStats.getAttackStats();

        TypeEffect typeEffect = new TypeEffect();
        totalDamage *= typeEffect.isTypeEffective(attacker, receiver);

        CritHit critHit = new CritHit();
        totalDamage *= critHit.critHitProbality();

        return totalDamage;
    }
}
