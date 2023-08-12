package pattern.builder;

public class NpcCharacterBuilder implements ICharacterBuilder{
    private String npcCharacter;

    public NpcCharacterBuilder() {
        this.npcCharacter = new String("This is the NPC character" + "\n");
    }

    @Override
    public NpcCharacterBuilder setFace(String faceShape) {
        this.npcCharacter = this.npcCharacter.concat(faceShape + "\n");
        return this;
    }

    @Override
    public NpcCharacterBuilder setBody(String bodyType) {
        this.npcCharacter = this.npcCharacter.concat(bodyType + "\n");
        return this;
    }

    @Override
    public NpcCharacterBuilder setHair(String hairStyle) {
        this.npcCharacter = this.npcCharacter.concat(hairStyle + "\n");
        return this;
    }

    @Override
    public NpcCharacterBuilder setOutfit(String outfit) {
        this.npcCharacter = this.npcCharacter.concat(outfit + "\n");
        return this;
    }

    @Override
    public NpcCharacterBuilder setFireArm(String fireArm) {
        this.npcCharacter = this.npcCharacter.concat(fireArm + "\n");
        return this;
    }

    public String build(){
        return npcCharacter;
    }
}
