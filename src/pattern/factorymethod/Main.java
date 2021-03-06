package pattern.factorymethod;

import java.time.Duration;

/**
 * This is am implementation of the factory method design pattern
 *
 * Here we are designing Mobile Legends, and are working on the spawning on the spawning
 * of the main creep that present in the middle of the screen. Now as we know, before 9 or
 * so minutes a Turtle is spawned and after that Lord is spawned. To solve this problem we
 * have designed a interface MainCreepFactory which has a method spawnCreeps(). This
 * interface is implemented by the class TimeBasedCreepSpawnFactory which, as the name
 * suggests, returns a MainCreep implemented class instance based on the elapsed game time.
 */
public class Main {
    public static Duration duration;
    public static void main(String[] args) {
        MainCreepFactory creepFactory = new TimeBasedCreepSpawnerFactory();

        duration = Duration.ofSeconds(40l);
        // 1st spawn
        spawnCreeps(creepFactory);

        duration = Duration.ofSeconds(640l);

        // 2nd spawn
        spawnCreeps(creepFactory);

    }

    public static void spawnCreeps(MainCreepFactory creepFactory) {
        MainCreep creep = creepFactory.spawnCreeps();
        creep.creepName();
        System.out.println(creep.creepBasicDamage());
    }
}
