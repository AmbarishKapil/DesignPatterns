package pattern.memento;

/**
 * This is an implementation of the memento design pattern
 *
 * Here we are implementing the logic for saving a game state and reloading the game from the
 * saved state. We have written a class GameState which gets updated and has the real time info
 * about the game character. From the game state we can make a memento GameStateMemento and add
 * it to the GameStateCaretaker, who maintains a stack of GameStateMemento's. There is also a
 * method restoreGameState() in GameStateMemento to take the memento and set it as the current
 * GameState
 */
public class Main {
    public static void main(String[] args) {
        GameState gameState = new GameState();

        GameStateCaretaker gameStateCaretaker = new GameStateCaretaker();
        gameStateCaretaker.saveGame(gameState);

        gameStateCaretaker.loadLastSavedGame();
    }
}
