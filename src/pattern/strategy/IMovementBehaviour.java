package pattern.strategy;

public interface IMovementBehaviour {
    String move();
}

class Run implements IMovementBehaviour{

    @Override
    public String move() {
        return "running";
    }
}

class Fly implements IMovementBehaviour{

    @Override
    public String move() {
        return "soaring in the skies";
    }
}

class Crawl implements IMovementBehaviour{

    @Override
    public String move() {
        return "crawling through the ground";
    }
}