package pattern.iterator;

public interface AbstractIterator {
    void moveNext();
    void movePrevious();
    Weapon giveCurrent();
}
