package pattern.command;

public class SprintForward implements ICommand{
    @Override
    public void execute() {
        System.out.println("Character runs forward.");
    }
}
