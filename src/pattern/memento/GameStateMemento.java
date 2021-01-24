package pattern.memento;

public class GameStateMemento {
    private GameState gameState;
    private double characterLocX, characterLocY;
    private String characterProgress;

    public GameStateMemento(GameState gameState, double characterLocX, double characterLocY, String characterProgress) {
        this.gameState = gameState;
        this.characterLocX = characterLocX;
        this.characterLocY = characterLocY;
        this.characterProgress = characterProgress;
    }

    public void restoreGameState(){
        gameState.setCharacterLoc(this.characterLocX, this.characterLocY);
        gameState.setCharacterProgress(this.characterProgress);
    }
}
