package pattern.observer;

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
