package pattern.iterator;

public interface AbstractInventory<T> {
    AbstractIterator createIterator();
    void addItemToInventory(T t);
}
