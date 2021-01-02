package pattern.builder;

public class Director {
    private ICharacterBuilder characterBuilder;

    public Director(ICharacterBuilder characterBuilder) {
        this.characterBuilder = characterBuilder;
    }

    public void makeMaleProtagonist(){
        this.characterBuilder.setBody("Strong muscular body");
        this.characterBuilder.setFace("Rugged face");
        this.characterBuilder.setHair("Bald");
    }

    public void makeFemaleProtagonist(){
        this.characterBuilder.setBody("Alluring lean body");
        this.characterBuilder.setFace("Aesthetically pleasing face");
        this.characterBuilder.setHair("Long luscious hair");
    }

    public void makeApparel(){
        this.characterBuilder.setBody("grey tank top and blue jeans");
        this.characterBuilder.setFace("Cool Shades");
        this.characterBuilder.setHair("Beanie");
    }
}
