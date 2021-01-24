package pattern.memento;

import java.util.List;
import java.util.Stack;

public class GameStateCaretaker {
    List<GameStateMemento> saveHistory = new Stack<>();

    public void saveGame(GameState gameState){
        saveHistory.add(gameState.createMemento());
        System.out.println("Game state saved.");
    }

    public void loadLastSavedGame(){
        if(!saveHistory.isEmpty()){
            System.out.println("Loading saved game");
            saveHistory.get(saveHistory.size()-1).restoreGameState();
        }else{
            System.out.println("No saves available!");
        }
    }
}
