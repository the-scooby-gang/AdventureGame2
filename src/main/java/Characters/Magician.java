package Characters;

import CharactersInventory.MythicalCreature;
import CharactersInventory.Spell;

import java.util.ArrayList;

public class Magician {

    private String type;
    Spell spell;
    MythicalCreature mythicalCreature;
    private int XP;
    private ArrayList<Spell> spells;
    private ArrayList<MythicalCreature> mythicalCreatures;

    public Magician(String type, Spell spell, MythicalCreature mythicalCreature, int XP) {
        this.type = type;
        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
        this.XP = XP;
        this.spells = new ArrayList<>();
        this.mythicalCreatures = new ArrayList<>();
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

    public void addSpell(Spell spell){
        spells.add(spell);
    }


    public void addCreature(MythicalCreature mythicalCreature){
        mythicalCreatures.add(mythicalCreature);
    }

    public int spellCount(){
        return spells.size();
    }

    public int creatureCount(){
        return mythicalCreatures.size();
    }

}
