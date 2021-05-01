package pattern.singleton;

public final class TopTenGlobalLeaderBoard {
    private static final int TOP_TEN = 10;
    private static TopTenGlobalLeaderBoard topTenGlobalLeaderBoard;
    private static Player[] topTen = new Player[TOP_TEN];
    private TopTenGlobalLeaderBoard(){}

    public void enterTopTen(Player player){
        for(int i=0;i<TOP_TEN;i++){
            if(topTen[i] == null){
                topTen[i] = player;
                break;
            }
            else if(player.getPlayerPoints() > topTen[i].getPlayerPoints()){
                for(int j=TOP_TEN-1;j>i;j--){
                    topTen[j] = topTen[j-1];
                }
                topTen[i] = player;
                break;
            }
        }
    }

    public void diaplayTopTen(){
        System.out.println("Current Leaderboard");
        for(int i=0;i<10;i++){
            if(topTen[i] != null)
                System.out.println((i+1) + ". " + topTen[i].getPlayerName() + " -> " + topTen[i].getPlayerPoints());
        }
    }

    public static TopTenGlobalLeaderBoard  getTopTenGlobalLeaderBoard(){
        if(topTenGlobalLeaderBoard == null){
            topTenGlobalLeaderBoard = new TopTenGlobalLeaderBoard();
        }

        return topTenGlobalLeaderBoard;
    }
}
