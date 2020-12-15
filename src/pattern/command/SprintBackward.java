package pattern.command;

public class SprintBackward implements ICommand{
    @Override
    public void execute() {
        System.out.println("Character runs backward.");
    }
}
