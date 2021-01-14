package pattern.chainofresponsibility;

public class JoystickMovementHandler extends MovementHandler{
    boolean consoleActive = false;

    @Override
    public void handle(String destination) {
        if(consoleActive){
            System.out.println("Reading movement input from console...");
        }else {
            System.out.println("No console connected");
            next.handle(destination);
        }
    }
}
