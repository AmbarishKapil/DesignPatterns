package pattern.flyweight;

public class BulletType {
    private String color;
    private  String texture;

    public BulletType(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return "BulletType{" +
                "color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}
