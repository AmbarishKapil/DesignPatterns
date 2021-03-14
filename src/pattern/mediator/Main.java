package pattern.mediator;

/**
 * This is an implementation of the mediator design pattern
 *
 * Here we are implementing the game starting logic. The starting button is not clickable
 * until GameMode is selected and the appropriate map is loaded. Now the GameMode and MapGraphics
 * are interdependent, but they don't communicate directly with each, they use the StartGameScene
 * mediator to communicate.
 *
 */

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
