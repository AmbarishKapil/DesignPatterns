package pattern.factorymethod;

import java.time.Duration;

public class Main {
    public static Duration duration;
    public static void main(String[] args) {
        System.out.println("Welcome to yet another moba!");

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
