package pattern.singleton;

public class Player {
    private String playerName;
    private final String playerEmail;
    private int playerPoints;

    public Player(String playerName, String playerEmail) {
        this.playerName = playerName;
        this.playerEmail = playerEmail;
        this.playerPoints = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }
}
