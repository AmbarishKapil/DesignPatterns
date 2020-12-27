package pattern.state;

public class Attacking implements NPCState{
    @Override
    public void apologize(NPCBehaviour behaviour) {
        System.out.println("Apologizes to NPC...");
        System.out.println("NPC now in wandering state");
        behaviour.changeState(new Wandering());
    }

    @Override
    public void punch(NPCBehaviour behaviour) {

    }

    @Override
    public void pullOutGun(NPCBehaviour behaviour) {
        System.out.println("Pulls out gun at NPC...");
        System.out.println("NPC now in fleeing state");
        behaviour.changeState(new Fleeing());
    }
}
