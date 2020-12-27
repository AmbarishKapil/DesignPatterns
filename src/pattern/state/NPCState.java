package pattern.state;

public interface NPCState {
    void apologize(NPCBehaviour behaviour);
    void punch(NPCBehaviour behaviour);
    void pullOutGun(NPCBehaviour behaviour);
}
