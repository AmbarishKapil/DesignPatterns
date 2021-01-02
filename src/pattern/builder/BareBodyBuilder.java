package pattern.builder;

public class BareBodyBuilder implements ICharacterBuilder{
    private String body = "";

    @Override
    public void setFace(String faceShape) {
        this.body = this.body.concat("\n").concat(faceShape);
    }

    @Override
    public void setBody(String bodyType) {
        this.body = this.body.concat("\n").concat(bodyType);
    }

    @Override
    public void setHair(String hairStyle) {
        this.body = this.body.concat("\n").concat(hairStyle);
    }

    public String getBody(){
        return this.body;
    }
}
