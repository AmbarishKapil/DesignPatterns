package pattern.facade;

public class PokemonStats {
    private double attackStats = 100d;
    private double defenceStats = 2d;

    public double getAttackStats() {
        return attackStats;
    }

    public double getDefenceStats(){
        return defenceStats;
    }

    public void setAttackStats(double attackStats) {
        this.attackStats = attackStats;
    }
}
