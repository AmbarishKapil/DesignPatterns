package pattern.factorymethod;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to yet another moba!");

        MainCreepFactory creepFactory = new TimeBasedCreepSpawnerFactory();

        // 1st spawn
        spawnCreeps(creepFactory, 40l);

        // 2nd spawn
        spawnCreeps(creepFactory, 640l);

    }

    public static void spawnCreeps(MainCreepFactory creepFactory, long timeElapsed) {
        MainCreep creep = creepFactory.spawnCreeps(Duration.ofSeconds(timeElapsed));
        creep.creepName();
        System.out.println(creep.creepBasicDamage());
    }
}
