package pattern.composite;

public class Task implements IMission{
    private String missionStatement;
    private boolean missionStatus;

    public Task(String missionStatement) {
        this.missionStatement = missionStatement;
        this.missionStatus = false;
    }

    public void setMissionCompleted(){
        this.missionStatus = true;
    }

    @Override
    public String missionObjective() {
        return this.missionStatement;
    }

    @Override
    public boolean isMissionComplete() {
        return this.missionStatus;
    }
}
