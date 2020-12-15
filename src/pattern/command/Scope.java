package pattern.command;

public class Scope implements ICommand{
    @Override
    public void execute() {
        System.out.println("Zoom in.");
    }
}
