package pattern.nullobject;

public class Player {
    private boolean isPlayerStunned;
    private IMovement movement;

    public Player() {
        this.isPlayerStunned = false;
        movement = new Run();
    }

    public void stunPlayer(){
        this.isPlayerStunned = true;
        movement = new NullMovement();
    }

    public String movePlayer(){
        return movement.move();
    }
}
