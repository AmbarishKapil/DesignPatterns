package pattern.strategy;

public class AerialTrooper extends Avatar {
    public AerialTrooper() {
        super("Aerial Trooper", 3.99d, new Fly(),new Wind());
    }
}
