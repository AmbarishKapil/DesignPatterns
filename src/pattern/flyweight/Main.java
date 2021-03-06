package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This is an implementation of the flyweight design pattern
 *
 * Here we are writing a class for spawning bullets. For spawning bullets we need the (x, y)
 * co-ordinates of the spawned bullet and the colour and texture of the bullet. The x and y
 * co-ordinates are just double values but we need to render the color and texture of the
 * bullet and that becomes expensive when we talk about spawning thousands of bullets. Thus we
 * have separated the color and texture to another class called BulletType and have constructed
 * a BulletTypeFactory to get BulletType objects. But, as we have already discussed, spawning BulletType
 * object is expensive due to the rendering time, we maintain a storage for the BulletType. If
 * there is an requirement for a particular type of BulletType, we look up the storage to see if it
 * already exists, if so we return the saved BulletType but if there is no such BulletType saved
 * we once render a BulletType and save it to storage to streamline further spawning of
 * such a BulletType.
 */
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
