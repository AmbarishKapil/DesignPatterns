package pattern.singleton;

/**
 * This is an implementation of the singleton design pattern
 *
 * Here we are maintaining a global leaderboard for Dota. As this is a global leaderboard,
 * there can only be one instance of this leaderboard. Thus we have implemented the singleton
 * design pattern where the constraint is the there can only ever exist one instance of
 * TopTenGlobalLeaderBoard.
 */
public class Main {
    public static void main(String[] args) {
        Player dendi = new Player("Danil", "dendi@dota.com");
        dendi.setPlayerPoints(3021);
        Player sumail = new Player("Sumail", "sumail@dota.com");
        sumail.setPlayerPoints(3003);
        Player miracle = new Player("Miracle", "miracle@dota.com");
        miracle.setPlayerPoints(3211);
        Player universe = new Player("Universe", "universe@dota.com");
        universe.setPlayerPoints(2987);
        Player notail = new Player("BigDaddyNoTail", "notail@dota.com");
        notail.setPlayerPoints(2999);

        TopTenGlobalLeaderBoard topTen = TopTenGlobalLeaderBoard.getTopTenGlobalLeaderBoard();

        topTen.enterTopTen(dendi);
        topTen.enterTopTen(sumail);
        topTen.enterTopTen(miracle);
        topTen.enterTopTen(universe);
        topTen.enterTopTen(notail);

        topTen.diaplayTopTen();

        TopTenGlobalLeaderBoard topTenAgain = TopTenGlobalLeaderBoard.getTopTenGlobalLeaderBoard();

        Player arteezy = new Player("Artour Babaev", "arteezy@dota.com");
        arteezy.setPlayerPoints(3000);
        topTenAgain.enterTopTen(arteezy);

        topTenAgain.diaplayTopTen();
    }
}
