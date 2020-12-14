package pattern.singleton;

public class Main {
    public static void main(String[] args) {
        Player dendi = new Player("Danil", "dendi@dota.com");
        Player sumail = new Player("Sumail", "sumail@dota.com");
        Player miracle = new Player("Miracle", "miracle@dota.com");
        Player universe = new Player("Universe", "universe@dota.com");
        Player notail = new Player("BigDaddyNoTail", "notail@dota.com");

        TopTenGlobalLeaderBoard topTen = TopTenGlobalLeaderBoard.getTopTenGlobalLeaderBoard();

        topTen.enterTopTen(dendi);
        topTen.enterTopTen(sumail);
        topTen.enterTopTen(miracle);
        topTen.enterTopTen(universe);
        topTen.enterTopTen(notail);

        TopTenGlobalLeaderBoard topTenAgain = TopTenGlobalLeaderBoard.getTopTenGlobalLeaderBoard();

        Player arteezy = new Player("Artour Babaev", "arteezy@dota.com");

        topTenAgain.enterTopTen(arteezy);

        topTenAgain.diaplayTopTen();
    }
}
