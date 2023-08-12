package pattern.builder;

public class MainCharacterBuilder implements ICharacterBuilder{
    // Ideally I should have designed a MainCharacter class that MainCharacterBuilder builds, but in the interest of
    // reducing complexity and our learning confined to the scope of Builder Pattern, we will just build a string as the complex object
    private String mainCharacter;

    public MainCharacterBuilder() {
        this.mainCharacter = new String("This is the main character" + "\n");
    }

    @Override
    public MainCharacterBuilder setFace(String faceShape) {
        this.mainCharacter = this.mainCharacter.concat(faceShape + "\n");
        return this;
    }

    @Override
    public MainCharacterBuilder setBody(String bodyType) {
        this.mainCharacter = this.mainCharacter.concat(bodyType + "\n");
        return this;
    }

    @Override
    public MainCharacterBuilder setHair(String hairStyle) {
        this.mainCharacter = this.mainCharacter.concat(hairStyle + "\n");
        return this;
    }

    @Override
    public MainCharacterBuilder setOutfit(String outfit) {
        this.mainCharacter = this.mainCharacter.concat(outfit + "\n");
        return this;
    }

    @Override
    public MainCharacterBuilder setFireArm(String fireArm) {
        this.mainCharacter = this.mainCharacter.concat(fireArm + "\n");
        return this;
    }

    public String build(){
        return mainCharacter;
    }
}
