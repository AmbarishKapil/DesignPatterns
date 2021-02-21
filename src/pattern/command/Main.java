package pattern.command;

/**
 * This is an implementation of the command pattern
 *
 * Here we are programming the controls feature of a FirstPersonShooter game, we can set
 * whatever keys we like for different actions to be performed, The client(here Main) has
 * set forward key for the character to move forward, backward key for the character to move
 * backward and so forth. We can re-configure the key bindings using the Controller class
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.setLeftClick(new FireGun());
        controller.setRightClick(new Scope());
        controller.setDownDirectionKey(new SprintBackward());
        controller.setUpDirectionKey(new SprintForward());

        controller.pressUpDirectionKey();
        controller.pressRightClick();
        controller.pressLeftClick();
    }
}
