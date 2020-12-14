package pattern.singleton;

public final class TopTenGlobalLeaderBoard {
    private static TopTenGlobalLeaderBoard topTenGlobalLeaderBoard;
    private static Player[] topTen = new Player[10];
    private TopTenGlobalLeaderBoard(){}

    public void enterTopTen(Player player){
        for(int i=0;i<10;i++){
            if(topTen[i] == null){
                topTen[i] = player;
                break;
            }
            else if(player.getPlayerPoints() > topTen[i].getPlayerPoints()){
                for(int j=i;j<9;j++){
                    topTen[j+1] = topTen[j];
                }
                topTen[i] = player;
                break;
            }
        }
    }

    public void diaplayTopTen(){
        for(int i=0;i<10;i++){
            if(topTen[i] != null)
                System.out.println(topTen[i].getPlayerName());
        }
    }

    public static TopTenGlobalLeaderBoard  getTopTenGlobalLeaderBoard(){
        if(topTenGlobalLeaderBoard == null){
            topTenGlobalLeaderBoard = new TopTenGlobalLeaderBoard();
        }

        return topTenGlobalLeaderBoard;
    }
}
