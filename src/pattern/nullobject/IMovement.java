package pattern.nullobject;

public interface IMovement {
    String move();
}

class Run implements IMovement{

    @Override
    public String move() {
        return "Player running";
    }
}

class NullMovement implements IMovement{
    @Override
    public String move() {
        return "Player cannot move";
    }
}

