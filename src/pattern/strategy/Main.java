package pattern.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Avatar> avatars = new ArrayList<>();
        avatars.add(new Avatar("Mr. Magma", 0.99d, new Crawl(), new Fire()));
        avatars.add(new Avatar("Arctic Wolf", 4.99d, new Run(), new Ice()));
        avatars.add(new Avatar("Aerial Trooper", 3.99d, new Fly(),new Wind()));

        for(int i=0;i<avatars.size();i++){
            System.out.println(avatars.get(i).moveCharacter());
            System.out.println(avatars.get(i).attack());
            System.out.println();
        }
    }
}
