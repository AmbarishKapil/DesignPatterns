package pattern.builder;

public class AttireBuilder implements ICharacterBuilder{
    private String clothes = "";

    @Override
    public void setFace(String faceShape) {
        this.clothes = this.clothes.concat("\n").concat(faceShape);
    }

    @Override
    public void setBody(String bodyType) {
        this.clothes = this.clothes.concat("\n").concat(bodyType);
    }

    @Override
    public void setHair(String hairStyle) {
        this.clothes = this.clothes.concat("\n").concat(hairStyle);
    }

    public String getClothes(){
        return this.clothes;
    }
}
