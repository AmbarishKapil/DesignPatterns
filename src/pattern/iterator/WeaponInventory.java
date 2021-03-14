package pattern.iterator;

import java.util.ArrayList;

public class WeaponInventory implements AbstractInventory<Weapon>{
    private ArrayList<Weapon> weapons;

    public WeaponInventory() {
        this.weapons = new ArrayList<>();
        this.weapons.add(new Weapon(1.99d, "Fists"));
    }


    @Override
    public AbstractIterator createIterator() {
        return new WeaponIterator(this);
    }

    @Override
    public void addItemToInventory(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
}
