package Characters;

import CharactersInventory.Weapon;

import java.util.ArrayList;

public class Warrior {

    private String type;
    Weapon weapon;
    private ArrayList<Weapon> weapons;
    private int XP;

    public Warrior(String type, Weapon weapon, ArrayList<Weapon> weapons, int XP) {
        this.type = type;
        this.weapon = weapon;
        this.weapons = weapons;
        this.XP = XP;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getXP() {
        return XP;
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public int weaponCount(){
        return weapons.size();
    }


}
