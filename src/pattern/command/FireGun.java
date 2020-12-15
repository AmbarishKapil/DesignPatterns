package pattern.command;

public class FireGun implements ICommand{
    @Override
    public void execute() {
        System.out.println("Fires gun...!");
    }
}
