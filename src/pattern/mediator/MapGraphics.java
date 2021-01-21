package pattern.mediator;

import java.util.Random;

public class MapGraphics implements Component{
    private enum maps{
        NORMAL_MAP,
        SURVIVAL_MAP,
        LINEAR_MAP
    }

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation() {
        Random r = new Random();
        int num = r.nextInt(10);
        if(num <= 1){
            mediator.notify(this, "Issues while loading map");
        }else{
            mediator.notify(this, "Map loaded");
        }
    }

    public void loadMap(String gameMode){
        switch (gameMode){
            case "CLASSIC":
            case "RANK": {
                System.out.println("loading " + maps.NORMAL_MAP.toString());
                operation();
                break;
            }
            case "SURVIVAL": {
                System.out.println("loading " + maps.SURVIVAL_MAP.toString());
                operation();
                break;
            }
            case "BRAWL": {
                System.out.println("loading " + maps.LINEAR_MAP.toString());
                operation();
                break;
            }
        }
    }

}
