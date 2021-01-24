package pattern.visitor;

public class Pokemon implements IPokemon {
    private String pokemonName;
    private String pokemonType;
    private double hp;
    private double attack;
    private double speed;

    public Pokemon() {
        this.pokemonName = "Eevee";
        this.pokemonType = "Normal";
        this.hp = 4.0d;
        this.attack = 4.0d;
        this.speed = 4.0d;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getPokemonName() {
        return pokemonName;
    }

    @Override
    public String getPokemonType() {
        return pokemonType;
    }

    @Override
    public double getHP() {
        return hp;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setPokemonName(String name) {
        this.pokemonName = name;
    }

    @Override
    public void setPokemonType(String type) {
        this.pokemonType = type;
    }

    @Override
    public void setHP(double hp) {
        this.hp = hp;
    }

    @Override
    public void setAttack(double attack) {
        this.attack = attack;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokemonName='" + pokemonName + '\'' +
                ", pokemonType='" + pokemonType + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", speed=" + speed +
                '}';
    }
}
