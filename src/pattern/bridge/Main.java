package pattern.bridge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehiclePreview> carPreviews = new ArrayList<>();
        RacingVehicle raceCar = new RaceCar();
        carPreviews.add(new HaltedView(raceCar));
        carPreviews.add(new RunningView(raceCar));

        List<VehiclePreview> bikePreviews = new ArrayList<>();
        RacingVehicle raceBike = new RaceBike();
        bikePreviews.add(new HaltedView(raceBike));
        bikePreviews.add(new RunningView(raceBike));

        for(int i=0;i<2;i++){
            carPreviews.get(i).preview();
            bikePreviews.get(i).preview();
        }
    }
}
