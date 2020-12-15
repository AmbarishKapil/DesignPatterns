package pattern.command;

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
