package pattern.state;

public class Main {
    public static void main(String[] args) {
        NPCBehaviour behaviour = new NPCBehaviour();
        behaviour.punch();
        behaviour.apologize();
        behaviour.pullOutGun();
    }
}
