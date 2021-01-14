package pattern.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        MovementHandler movementHandler = new JoystickMovementHandler().setNext(new KeyboardMovementHandler().setNext(new AutoMovementHandler()));
        movementHandler.handle("Ruins");
    }
}
