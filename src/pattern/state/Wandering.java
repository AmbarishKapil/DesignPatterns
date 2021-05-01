package pattern.state;

public class Wandering implements NPCState{
    @Override
    public void apologize(NPCContext context) {

    }

    @Override
    public void punch(NPCContext context) {
        System.out.println("Punches NPC...");
        System.out.println("NPC now in attacking state");
        context.changeState(new Attacking());
    }

    @Override
    public void pullOutGun(NPCContext context) {
        System.out.println("Pulls out gun at NPC...");
        System.out.println("NPC now in fleeing state");
        context.changeState(new Fleeing());
    }
}
