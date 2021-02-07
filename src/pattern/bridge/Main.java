package pattern.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an implementation of the bridge pattern
 *
 * Here we have a racing game and we are in the vehicle selection option. Thus we have an
 * interface RacingVehicle and classes RaceCar and RaceBike that implement that interface.
 * Now for every vehicle there are multiple previews. This is done by the interface
 * VehiclePreview and classes RunningView and HaltedView that implement that interface.
 * Now since we have structured the code with the bridge patten adding another view to the
 * existing vehicles would be easy.
 */
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
