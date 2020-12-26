package pattern.iterator;

public class WeaponIterator implements AbstractIterator{
    WeaponInventory weaponInventory;
    int index;

    public WeaponIterator(WeaponInventory weaponInventory) {
        this.weaponInventory = weaponInventory;
        index = 0;
    }

    @Override
    public void moveNext() {
        if(index < weaponInventory.getWeapons().size() - 1){
            index++;
        }else{
            index = 0;
        }
    }

    @Override
    public void movePrevious() {
        if(index > 0){
            index--;
        }else{
            index = weaponInventory.getWeapons().size() - 1;
        }
    }

    @Override
    public Weapon giveCurrent() {
        return weaponInventory.getWeapons().get(index);
    }
}
