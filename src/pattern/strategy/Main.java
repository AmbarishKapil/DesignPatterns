package pattern.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Avatar> avatars = new ArrayList<>();
        avatars.add(new MrMagma());
        avatars.add(new AerialTrooper());
        avatars.add(new ArcticWolf());

        for(int i=0;i<avatars.size();i++){
            System.out.println(avatars.get(i).moveCharacter());
            System.out.println(avatars.get(i).attack());
            avatars.get(i).firstSkill();
            avatars.get(i).secondSkill();
            avatars.get(i).ultimateSkill();
            System.out.println();
        }
    }
}
