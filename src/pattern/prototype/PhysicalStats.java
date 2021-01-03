package pattern.prototype;

public class PhysicalStats implements IPhysicalStats{
    private double height;
    private double weight;

    public PhysicalStats(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }


}
