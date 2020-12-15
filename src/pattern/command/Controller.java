package pattern.command;

public class Controller {
    private ICommand upDirectionKey;
    private ICommand downDirectionKey;
    private ICommand rightDirectionKey;
    private ICommand leftDirectionKey;
    private ICommand leftClick;
    private ICommand rightClick;

    public void setUpDirectionKey(ICommand upDirectionKey) {
        this.upDirectionKey = upDirectionKey;
    }

    public void setDownDirectionKey(ICommand downDirectionKey) {
        this.downDirectionKey = downDirectionKey;
    }

    public void setRightDirectionKey(ICommand rightDirectionKey) {
        this.rightDirectionKey = rightDirectionKey;
    }

    public void setLeftDirectionKey(ICommand leftDirectionKey) {
        this.leftDirectionKey = leftDirectionKey;
    }

    public void setLeftClick(ICommand leftClick) {
        this.leftClick = leftClick;
    }

    public void setRightClick(ICommand rightClick) {
        this.rightClick = rightClick;
    }

    public void pressLeftClick(){
        leftClick.execute();
    }

    public void pressRightClick(){
        rightClick.execute();
    }

    public void pressUpDirectionKey(){
        upDirectionKey.execute();
    }

    public void pressDownDirectionKey(){
        downDirectionKey.execute();
    }
    public void pressLeftDirectionKey(){
        leftDirectionKey.execute();
    }
    public void pressRightDirectionKey(){
        rightDirectionKey.execute();
    }
}
