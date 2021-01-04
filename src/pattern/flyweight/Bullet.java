package pattern.flyweight;

public class Bullet {
    private double x;
    private double y;
    private BulletType bulletType;

    public Bullet(double x, double y, BulletType bulletType) {
        this.x = x;
        this.y = y;
        this.bulletType = bulletType;
    }

    public void spawnBullets(String gameScene){
        System.out.println("Spawning bullet of " + bulletType + " at (" + x + ", " + y + ") in " + gameScene);
    }
}
