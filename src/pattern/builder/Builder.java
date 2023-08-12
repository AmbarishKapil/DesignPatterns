package pattern.builder;

public class Builder {

    public String constructMainCharacter(MainCharacterBuilder builder){
        return builder
                .setFace("Rugged yet Handsome Face")
                .setBody("Muscular Body")
                .setHair("Spiky Hair")
                .setOutfit("Military Uniform")
                .setFireArm("M16")
                .build();
    }

    public String constructNpcCharacter(NpcCharacterBuilder builder){
        return builder
                .setFace("Civilian Face")
                .setBody("Fat toned Body")
                .setHair("Long Hair")
                .setOutfit("Tank top and Jeans")
                .build();
    }
}
