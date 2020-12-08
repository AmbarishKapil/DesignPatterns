package pattern.factorymethod;

import java.time.Duration;

public class TimeBasedCreepSpawnerFactory implements MainCreepFactory{
    @Override
    public MainCreep spawnCreeps(Duration duration) {
        if(duration.getSeconds() <= 600l){
            return new Turtle();
        }else{
            return new Lord();
        }
    }
}
