package pattern.chainofresponsibility;

public class AutoMovementHandler extends MovementHandler{
    @Override
    public void handle(String destination) {
        System.out.println("Automatically moving towards " + destination);
    }
}
