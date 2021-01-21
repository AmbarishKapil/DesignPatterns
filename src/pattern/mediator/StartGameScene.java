package pattern.mediator;

public class StartGameScene implements Mediator {
    private boolean startGameButtonEnabled = false;
    private GameMode gameMode;
    private MapGraphics mapGraphics;

    public StartGameScene(GameMode gameMode, MapGraphics mapGraphics) {
        this.gameMode = gameMode;
        this.mapGraphics = mapGraphics;
    }

    @Override
    public void notify(Component sender, String event) {
        if(sender == gameMode){
            mapGraphics.loadMap(event);
        }else if(sender == mapGraphics){
            System.out.println(event);
            if(event.contains("loaded")){
                startGameButtonEnabled = true;
            }
        }
    }

    public void startGame(){
        if(startGameButtonEnabled){
            System.out.println("StartGame button is clicked. Game starts");
        }else{
            System.out.println("StartGame button is not clickable");
        }
    }
}
