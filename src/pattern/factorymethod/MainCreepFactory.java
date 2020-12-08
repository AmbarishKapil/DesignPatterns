package pattern.factorymethod;

import java.time.Duration;

public interface MainCreepFactory {
    MainCreep spawnCreeps(Duration duration);
}
