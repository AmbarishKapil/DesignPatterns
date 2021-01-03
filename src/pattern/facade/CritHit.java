package pattern.facade;

import java.util.Random;

public class CritHit {
    private double critHitRatio = 0.3d;

    public double critHitProbality(){
        Random random = new Random();
        int r = random.nextInt(10);
        if(r <= critHitRatio*10){
            return 1.3;
        }else{
            return 1;
        }
    }
}
