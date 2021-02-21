package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an implementation of the composite design pattern
 *
 * Here we can dynamically add missions to our mission tree. Say a particular mission is
 * added depending on your location or some other game choice we will need to add that
 * mission and it's submissions dynamically
 */
public class Main {
    public static void main(String[] args) {
        List<IMission> missions = new ArrayList<>();

        Task rescueMission = new Task("Rescue Hostages");
        Task eliminateMission = new Task("Eliminate the terrorists");

        missions.add(rescueMission);
        missions.add(eliminateMission);

        List<IMission> subMissions = new ArrayList<>();
        Task pickUpDiffuseKit = new Task("Pick up bomb diffuse kit");
        subMissions.add(pickUpDiffuseKit);
        Mission diffuseBomb = new Mission("Diffuse the ticking time-bomb", subMissions);

        missions.add(diffuseBomb);

        Mission mainMission = new Mission("Secure and Eliminate!", missions);
        System.out.println(mainMission.missionObjective());
        System.out.println(mainMission.isMissionComplete());

        rescueMission.setMissionCompleted();
        eliminateMission.setMissionCompleted();

        System.out.println(mainMission.isMissionComplete());

        pickUpDiffuseKit.setMissionCompleted();

        System.out.println(mainMission.isMissionComplete());
    }
}
