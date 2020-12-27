package pattern.state;

public class Wandering implements NPCState{
    @Override
    public void apologize(NPCBehaviour behaviour) {

    }

    @Override
    public void punch(NPCBehaviour behaviour) {
        System.out.println("Punches NPC...");
        System.out.println("NPC now in attacking state");
        behaviour.changeState(new Attacking());
    }

    @Override
    public void pullOutGun(NPCBehaviour behaviour) {
        System.out.println("Pulls out gun at NPC...");
        System.out.println("NPC now in fleeing state");
        behaviour.changeState(new Fleeing());
    }
}
