package pattern.chainofresponsibility;

public class KeyboardMovementHandler extends MovementHandler{
    boolean keyPress = false;

    @Override
    public void handle(String destination) {
        if(keyPress){
            System.out.println("Reading movement key-press form keyboard...");
        }else {
            System.out.println("No keyboard input");
            next.handle(destination);
        }
    }
}
