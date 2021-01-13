package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static List<Bullet> bullets = new ArrayList<>();

    public static void main(String[] args) {
        Random r = new Random();

        for(int i=0;i<10000;i++){
            addBullets(
                    r.nextDouble(),
                    r.nextDouble(),
                    (i%2==0)?BulletTypeFactory.getBulletType("Metallic", "smooth"):BulletTypeFactory.getBulletType("Metallic", "rugged")
            );
        }

        for (Bullet b:bullets) {
            b.spawnBullets("Fighting Arena");
        }
    }

    public static void addBullets(double x, double y, BulletType bulletType) {
        Bullet bullet = new Bullet(x, y, bulletType);
        bullets.add(bullet);
    }
}
