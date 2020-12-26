package pattern.composite;

public class SubMissions implements IMission{
    private String missionStatement;
    private boolean missionStatus;

    public SubMissions(String missionStatement) {
        this.missionStatement = missionStatement;
        this.missionStatus = false;
    }

    public void setMissionCompleted(){
        this.missionStatus = true;
    }

    @Override
    public String missionObjective() {
        return null;
    }

    @Override
    public boolean isMissionComplete() {
        return this.missionStatus;
    }
}
