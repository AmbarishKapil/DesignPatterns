package pattern.observer;

public class PoliceTeam implements IObserver {
    SubjectMap subjectMap;

    PoliceTeam(SubjectMap subjectMap){
        this.subjectMap = subjectMap;
    }

    @Override
    public void update() {
        System.out.println(subjectMap.getBombArea() + "... diffusing the bomb ASAP");
    }
}
