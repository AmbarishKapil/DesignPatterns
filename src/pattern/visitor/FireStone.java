package pattern.visitor;

public class FireStone implements Stone{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String appearance() {
        return "A red coloured translucent stone";
    }
}
