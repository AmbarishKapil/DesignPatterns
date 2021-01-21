package pattern.mediator;

import java.util.Scanner;

public class GameMode implements Component{
    private enum gameModes{
        CLASSIC,
        RANK,
        SURVIVAL,
        BRAWL
    }

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation() {
        System.out.println("Choose a game mode:\n1. Classic\n2. Rank\n3. Survival\n4. Brawl");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option){
            default: {
                mediator.notify(this, gameModes.CLASSIC.toString());
                break;
            }
            case 2: {
                mediator.notify(this, gameModes.RANK.toString());
                break;
            }
            case 3:{
                mediator.notify(this, gameModes.SURVIVAL.toString());
                break;
            }
            case 4:{
                mediator.notify(this, gameModes.BRAWL.toString());
            }
        }
    }
}
