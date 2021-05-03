package pattern.visitor;

public interface Stone {
    void accept(Visitor v);
    String appearance();
}
