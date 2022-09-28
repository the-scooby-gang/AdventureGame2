import Characters.Magician;
import CharactersInventory.MythicalCreature;
import CharactersInventory.Spell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MagicianTest {

    Magician magician;
    Spell spell;
    MythicalCreature mythicalCreature;

    @Before
    public void before(){
        mythicalCreature = new MythicalCreature("Dragon", 30);
        spell = new Spell ("Confuse", 10);
        magician = new Magician("Witch", spell, mythicalCreature, 75);
    }

    @Test
    public void canGetCreatureType(){
        assertEquals("Dragon", mythicalCreature.getType());
    }

    @Test
    public void canGetSpellType(){
        assertEquals("Confuse", spell.getType());
    }

    @Test
    public void canGetMagicianType(){
        assertEquals("Witch", magician.getType());
    }

    @Test
    public void canAddCreature(){
        magician.addCreature(mythicalCreature);
        assertEquals(1, magician.creatureCount());
    }

    @Test
    public void canAddSpell(){
        magician.addSpell(spell);
        assertEquals(1, magician.spellCount());
    }
}
