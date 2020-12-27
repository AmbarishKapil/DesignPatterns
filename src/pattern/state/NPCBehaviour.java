package pattern.state;

public class NPCBehaviour {
    private NPCState state;

    public NPCBehaviour() {
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
