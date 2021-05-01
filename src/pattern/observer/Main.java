package pattern.observer;

import java.util.EnumSet;

/**
 * This is an implementation of the observer design pattern.
 *
 * Here we are designing a Counter Strike type game where there are two teams police and
 * terrorist. Both the teams play on a common map and both teams gets notified every time
 * there is an event on the map. Now if the team members had to poll for the event, it
 * would be inefficient, thus we have written the observer pattern such that anytime something
 * notify worthy happens the teams gets notified and can act accordingly
 */
public class Main {
    public static void main(String[] args) {
        SubjectMap map = new SubjectMap();

        IObserver police1 = new PoliceTeam(map);
        map.registerObserver(police1);
        IObserver police2 = new PoliceTeam(map);
        map.registerObserver(police2);
        IObserver police3 = new PoliceTeam(map);
        map.registerObserver(police3);
        IObserver police4 = new PoliceTeam(map);
        map.registerObserver(police4);
        IObserver police5 = new PoliceTeam(map);
        map.registerObserver(police5);

        IObserver terrorist1 = new TerroristTeam(map);
        map.registerObserver(terrorist1);
        IObserver terrorist2 = new TerroristTeam(map);
        map.registerObserver(terrorist2);
        IObserver terrorist3 = new TerroristTeam(map);
        map.registerObserver(terrorist3);
        IObserver terrorist4 = new TerroristTeam(map);
        map.registerObserver(terrorist4);
        IObserver terrorist5 = new TerroristTeam(map);
        map.registerObserver(terrorist5);

        map.plantBomb("Area A");
    }
}
