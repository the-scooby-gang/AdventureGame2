package Characters;

import CharactersInventory.CharacterInventory;

public class Enemy {
    private String type;
    private int XP;

    public Enemy(String type, int XP) {
        this.type = type;
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

    public void setXP(int XP) {
        this.XP = XP;
    }
}
