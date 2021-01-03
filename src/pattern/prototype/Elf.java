package pattern.prototype;

public class Elf implements Cloneable{
    private String name;
    private IPhysicalStats physicalStats;

    public Elf(String name, IPhysicalStats physicalStats) {
        this.name = name;
        this.physicalStats = physicalStats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhysicalStats(double height, double weight) {
        this.physicalStats.setHeight(height);
        this.physicalStats.setWeight(weight);
    }

    public Elf clone() throws CloneNotSupportedException {
        Elf newElf = new Elf(this.name, new PhysicalStats(this.physicalStats.getHeight(), this.physicalStats.getWeight()));
        return newElf;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", height=" + physicalStats.getHeight() +
                ", weight=" + physicalStats.getWeight() +
                '}';
    }
}
