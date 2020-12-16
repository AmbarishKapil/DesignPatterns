package pattern.bridge;

public class HaltedView implements VehiclePreview{
    RacingVehicle vehicle;

    public HaltedView(RacingVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void preview() {
        System.out.println(vehicle.engine());
        vehicle.interior();
    }
}
