package pattern.bridge;

public class RaceBike implements RacingVehicle{
    @Override
    public String engine() {
        return "350cc engine";
    }

    @Override
    public double maximumSpeed() {
        return 250.0d;
    }

    @Override
    public void interior() {}
}
