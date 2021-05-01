package pattern.state;

/**
 * This is an implementation of the state pattern
 *
 * Here we are programming the behaviour of our NPC characters, At the time of spawn all of
 * them are in a wandering mode, the depending on the interaction with then main character
 * their state changes. To Accomplish this we have written a state pattern where we have \
 * defined an interface NPCState, which contains the methods apologise, punch and pullOutGun.
 * Three Classes Wandering, Fleeing and Attacking are implements NPCState and overrides the
 * mentioned methods. There is a class NPCContext that the client code interacts with and
 * it has a reference to one of the concrete state which it uses to navigate through various states
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        NPCContext context = new NPCContext();
        context.punch();
        context.apologize();
        context.pullOutGun();
    }
}
