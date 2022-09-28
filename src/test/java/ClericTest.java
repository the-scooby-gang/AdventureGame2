import Characters.Cleric;
import CharactersInventory.Healing;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Healing healing;
    Healing healing1;
    Cleric cleric;

    @Before
    public void before(){
        healing = new Healing("Herb", 10);
        healing1 = new Healing("Potion", 50);
        cleric = new Cleric("Padre", healing);
    }

    @Test
    public void getHealingType(){
        assertEquals("Herb", healing.getType());
    }

    @Test
    public void getHealing1XP(){
        assertEquals(50, healing1.getXpEffect());
    }

    @Test
    public void canAddHealing(){
        cleric.addHealingTool(healing);
        cleric.addHealingTool(healing1);
        assertEquals(2, cleric.healingCount());
    }


}
