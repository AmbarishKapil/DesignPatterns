package pattern.strategy;

public class Avatar {
    private final String name;
    private double movementSpeed;
    private IMovementBehaviour movementBehaviour;
    private IElementBehaviour elementBehaviour;

    public Avatar(String name, double movementSpeed, IMovementBehaviour movementBehaviour, IElementBehaviour elementBehaviour) {
        this.name = name;
        this.movementSpeed = movementSpeed;
        this.movementBehaviour = movementBehaviour;
        this.elementBehaviour = elementBehaviour;
    }

    public String moveCharacter(){
        return this.name + " " + this.movementBehaviour.move() + " with speed " + this.movementSpeed;
    }

    public String attack(){
        return this.name + " uses " + this.elementBehaviour.attack();
    }
}
