package pattern.composite;

import java.util.List;

public class Mission implements IMission{
    private String missionStatement;
    private List<SubMissions> subMissionsList;

    public Mission(String missionStatement, List<SubMissions> subMissionsList) {
        this.missionStatement = missionStatement;
        this.subMissionsList = subMissionsList;
    }

    @Override
    public String missionObjective() {
        return this.missionStatement;
    }

    @Override
    public boolean isMissionComplete() {
        for(SubMissions mission : subMissionsList)
            if(!mission.isMissionComplete())
                return false;
        return true;
    }
}
