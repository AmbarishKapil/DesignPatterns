package pattern.memento;

// Keeps track of the current game state
public class GameState {
    private double characterLocX, characterLocY;
    private String characterProgress; //This should have been a BLOB object, but let's just go with string for simplicity

    public void setCharacterLoc(double x, double y){
        this.characterLocX = x;
        this.characterLocY = y;
    }

    public void setCharacterProgress(String characterProgress){
        this.characterProgress = characterProgress;
    }

    public GameStateMemento createMemento(){
        return new GameStateMemento(this, characterLocX, characterLocY, characterProgress);
    }

    // These get methods will be called by the game renderer which runs in an Update loop()
    public double getCharacterLoc() {
        return Math.sqrt(Math.pow(characterLocX,2) + Math.pow(characterLocY,2));
    }
    public String getCharacterProgress() {
        return characterProgress;
    }
}
