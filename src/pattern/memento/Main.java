package pattern.memento;

public class Main {
    public static void main(String[] args) {
        GameState gameState = new GameState();

        GameStateCaretaker gameStateCaretaker = new GameStateCaretaker();
        gameStateCaretaker.saveGame(gameState);

        gameStateCaretaker.loadLastSavedGame();
    }
}
