package pattern.observer;

public class TerroristTeam implements IObserver {
    SubjectMap subjectMap;

    TerroristTeam(SubjectMap subjectMap){
        this.subjectMap = subjectMap;
    }

    @Override
    public void update() {
        System.out.println(subjectMap.getBombArea() + "... Bang Bang!");
    }
}
