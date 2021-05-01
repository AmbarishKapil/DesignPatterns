package pattern.state;

public interface NPCState {
    void apologize(NPCContext context);
    void punch(NPCContext context);
    void pullOutGun(NPCContext context);
}
