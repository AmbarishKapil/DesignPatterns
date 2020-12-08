package pattern.factorymethod;

public class TimeBasedCreepSpawnerFactory implements MainCreepFactory{
    @Override
    public MainCreep spawnCreeps() {
        if(Main.duration.getSeconds() <= 600l){
            return new Turtle();
        }else{
            return new Lord();
        }
    }
}
