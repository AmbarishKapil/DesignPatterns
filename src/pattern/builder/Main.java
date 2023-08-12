package pattern.builder;

/**
 * This is an implementation of the builder pattern
 *
 * Here we are customizing our main character, which is a complex object, and subject to a lot of user preference.
 * We have a ICharacterBuilder interface and two classes AttireBuilder and BareBodyBuilder for the clothes and body type
 * that implement our interface. We also have a director class that gives us the default set male and
 * female main character design.
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();

        String mainCharacter = builder.constructMainCharacter(new MainCharacterBuilder());
        String npcCharacter = builder.constructNpcCharacter(new NpcCharacterBuilder());

        System.out.println(mainCharacter);
        System.out.println(npcCharacter);
    }
}
