package pattern.iterator;

public class Weapon {
    private double damageStats;
    private String weaponName;

    public Weapon(double damageStats, String weaponName) {
        this.damageStats = damageStats;
        this.weaponName = weaponName;
    }

    public double getDamageStats() {
        return this.damageStats;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
