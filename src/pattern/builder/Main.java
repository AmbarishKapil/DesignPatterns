package pattern.builder;

/**
 * This is an implementation of the builder pattern
 *
 * Here we are customizing our main character, we have a ICharacterBuilder interface and
 * two classes AttireBuilder and BareBodyBuilder for the clothes and body type that implement
 * our interface. We also have a director class that gives us the default set male and
 * female main character design.
 */
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
