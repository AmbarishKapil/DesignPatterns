package pattern.composite;

import java.util.List;

public class Mission implements IMission{
    private String missionStatement;
    private List<IMission> subMissionsList;

    public Mission(String missionStatement, List<IMission> subMissionsList) {
        this.missionStatement = missionStatement;
        this.subMissionsList = subMissionsList;
    }

    public Mission(String missionStatement){
        this.missionStatement = missionStatement;
    }

    @Override
    public String missionObjective() {
        return this.missionStatement;
    }

    @Override
    public boolean isMissionComplete() {
        for(IMission mission : subMissionsList)
            if(!mission.isMissionComplete())
                return false;
        return true;
    }
}
