package pattern.iterator;

public interface AbstractInventory {
    AbstractIterator createIterator();
    void addItemToInventory(Weapon weapon);
}
