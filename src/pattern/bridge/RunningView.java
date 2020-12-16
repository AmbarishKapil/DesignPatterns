package pattern.bridge;

public class RunningView implements VehiclePreview{
    RacingVehicle vehicle;

    public RunningView(RacingVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void preview() {
        System.out.println(vehicle.maximumSpeed());
    }
}
