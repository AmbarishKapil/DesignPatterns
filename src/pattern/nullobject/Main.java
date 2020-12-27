package pattern.nullobject;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println(player.movePlayer());
        player.stunPlayer();
        System.out.println(player.movePlayer());
    }
}
