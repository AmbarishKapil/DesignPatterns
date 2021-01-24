package pattern.visitor;

public class Main {
    public static void main(String[] args) {
        IPokemon pokemon = new Pokemon();
        System.out.println(pokemon);

        IPokemon pokemon1 = new Pokemon();
        pokemon1.accept(new FireStoneVisitor());
        System.out.println(pokemon1);

        IPokemon pokemon2 = new Pokemon();
        pokemon2.accept(new WaterStoneVisitor());
        System.out.println(pokemon2);

        IPokemon pokemon3 = new Pokemon();
        pokemon3.accept(new ThunderStoneVisitor());
        System.out.println(pokemon3);
    }


}
