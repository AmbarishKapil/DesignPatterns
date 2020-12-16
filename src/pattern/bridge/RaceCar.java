package pattern.bridge;

public class RaceCar implements RacingVehicle{
    @Override
    public String engine() {
        return "1500cc engine";
    }

    @Override
    public double maximumSpeed() {
        return 340.0d;
    }

    @Override
    public void interior() {
        System.out.println("Opens door!");
    }
}
