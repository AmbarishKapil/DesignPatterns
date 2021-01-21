package pattern.mediator;

public class Main {
    public static void main(String[] args) {
        GameMode gameMode = new GameMode();
        MapGraphics mapGraphics = new MapGraphics();

        StartGameScene startGameScene = new StartGameScene(gameMode, mapGraphics);
        gameMode.setMediator(startGameScene);
        mapGraphics.setMediator(startGameScene);

        startGameScene.startGame();

        gameMode.operation();

        startGameScene.startGame();

    }
}
