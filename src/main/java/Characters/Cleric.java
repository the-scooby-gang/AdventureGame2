package Characters;

import CharactersInventory.Healing;

import java.util.ArrayList;

public class Cleric {
    private String type;
    private ArrayList<Healing> healingTools;
    Healing healing;

    public Cleric(String type, Healing healing) {
        this.type = type;
        this.healingTools = new ArrayList();
        this.healing = healing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addHealingTool(Healing healing){
        healingTools.add(healing);
    }

    public int healingCount(){
        return healingTools.size();
    }

}
