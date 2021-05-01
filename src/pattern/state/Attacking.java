package pattern.state;

public class Attacking implements NPCState{
    @Override
    public void apologize(NPCContext context) {
        System.out.println("Apologizes to NPC...");
        System.out.println("NPC now in wandering state");
        context.changeState(new Wandering());
    }

    @Override
    public void punch(NPCContext context) {

    }

    @Override
    public void pullOutGun(NPCContext context) {
        System.out.println("Pulls out gun at NPC...");
        System.out.println("NPC now in fleeing state");
        context.changeState(new Fleeing());
    }
}
