package pattern.chainofresponsibility;

/**
 * This is an implementation of chain-of-responsibility design pattern
 *
 * Here we have a game scenario where the main character has to travel to the mission
 * location. Now there are several ways he can travel to the location, 1. He can con
 * move the character using a joystick(which has the height priority, and thus we check
 * for the joystick input first) 2. If the joystick is not connected we player can use
 * his keyboard to move the character 3. If even the keyboard has no input then we have
 * a auto movement algorithm that takes the character to the mission location
 */
public class Main {
    public static void main(String[] args) {
        MovementHandler movementHandler = new JoystickMovementHandler().setNext(new KeyboardMovementHandler().setNext(new AutoMovementHandler()));
        movementHandler.handle("Ruins");
    }
}
