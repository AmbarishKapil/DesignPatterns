package pattern.facade;

import java.util.Random;

public class CritHit {
    PokemonStats pokemonStats;
    private double critHitRatio;

    public CritHit(){
        pokemonStats = new PokemonStats();
        critHitRatio = 0.3d;
    }

    public double critHitProbality(){
        Random random = new Random();
        int r = random.nextInt(10);
        if(r <= critHitRatio*10){
            return pokemonStats.getDefenceStats()/1.3;
        }else{
            return 1;
        }
    }
}
