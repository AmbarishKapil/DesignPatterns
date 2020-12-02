package pattern.strategy;

public interface IElementBehaviour {
    String attack();
}

class Fire implements IElementBehaviour{

    @Override
    public String attack() {
        return "Spitting fire!";
    }
}

class Ice implements IElementBehaviour{

    @Override
    public String attack() {
        return "Freeze ...";
    }
}

class Wind implements IElementBehaviour{

    @Override
    public String attack() {
        return "Storm bringer";
    }
}
