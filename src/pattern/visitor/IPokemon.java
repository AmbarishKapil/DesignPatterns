package pattern.visitor;

public interface IPokemon {
    void accept(Visitor visitor);
    String getPokemonName();
    String getPokemonType();
    double getHP();
    double getAttack();
    double getSpeed();
    void setPokemonName(String name);
    void setPokemonType(String type);
    void setHP(double hp);
    void setAttack(double attack);
    void setSpeed(double speed);
}
