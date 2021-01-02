package pattern.builder;

public class Main {
    public static void main(String[] args) {
        BareBodyBuilder bareBodyBuilder = new BareBodyBuilder();
        Director director = new Director(bareBodyBuilder);
        director.makeMaleProtagonist();
        System.out.println(bareBodyBuilder.getBody());
        AttireBuilder attireBuilder = new AttireBuilder();
        director = new Director(attireBuilder);
        director.makeApparel();
        System.out.println(attireBuilder.getClothes());
    }
}
