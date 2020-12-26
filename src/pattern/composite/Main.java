package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SubMissions> subMissionsList = new ArrayList<>();

        SubMissions rescueMission = new SubMissions("Rescue Hostages");
        SubMissions eliminateMission = new SubMissions("Eliminate the terrorists");
        SubMissions diffuseBomb = new SubMissions("Diffuse the ticking time-bomb");

        subMissionsList.add(rescueMission);
        subMissionsList.add(eliminateMission);
        subMissionsList.add(diffuseBomb);

        Mission mainMission = new Mission("Secure and Eliminate!", subMissionsList);
        System.out.println(mainMission.missionObjective());
        System.out.println(mainMission.isMissionComplete());

        rescueMission.setMissionCompleted();
        eliminateMission.setMissionCompleted();

        System.out.println(mainMission.isMissionComplete());

        diffuseBomb.setMissionCompleted();

        System.out.println(mainMission.isMissionComplete());
    }
}
