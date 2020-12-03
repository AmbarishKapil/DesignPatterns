package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectMap implements ISubject {
    private boolean isBombPlanted = false;
    private String bombArea;

    List<IObserver> players = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        players.add(observer);
    }

    @Override
    public void unregisterObserver(IObserver observer) {
        players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver player : players){
            player.update();
        }
    }

    public String getBombArea(){
        return "bomb has been planted near " + bombArea;
    }

    public void plantBomb(String bombArea) {
        this.isBombPlanted = true;
        this.bombArea = bombArea;

        notifyObservers();
    }
}
