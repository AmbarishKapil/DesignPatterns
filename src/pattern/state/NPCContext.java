package pattern.state;

public class NPCContext {
    private NPCState state;

    public NPCContext() {
        this.state = new Wandering();
    }

    public void changeState(NPCState state){
        this.state = state;
    }

    public void apologize(){
        state.apologize(this);
    }

    public void punch(){
        state.punch(this);
    }

    public void pullOutGun(){
        state.pullOutGun(this);
    }
}
