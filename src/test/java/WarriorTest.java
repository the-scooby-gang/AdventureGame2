import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Weapon weapon;
    Weapon weapon2;


    @Before
    public void before(){
        weapon = new Weapon ("Club", 10);
        weapon2 = new Weapon("javelin", 20);
        warrior = new Warrior("Barbarian", weapon ,new ArrayList<>(), 100);

    }

    @Test
    public void canGetWeaponType(){
        assertEquals("Club", weapon.getType());
    }

    @Test
    public void canGetWeapon2Type(){
        assertEquals("javelin", weapon2.getType());
    }

    @Test
    public void canGetWarriorType(){
        assertEquals("Barbarian", warrior.getType());
    }

    @Test
    public void canAddWeaponToArray(){
        warrior.addWeapon(weapon);
        assertEquals(1, warrior.weaponCount());
    }



}
