package pattern.visitor;

public class WaterStone implements Stone{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String appearance() {
        return "A blue coloured translucent stone";
    }
}
