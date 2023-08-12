package pattern.builder;

public interface ICharacterBuilder {
    ICharacterBuilder setFace(String faceShape);
    ICharacterBuilder setBody(String bodyType);
    ICharacterBuilder setHair(String hairStyle);

    ICharacterBuilder setOutfit(String outfit);

    ICharacterBuilder setFireArm(String fireArm);
}
