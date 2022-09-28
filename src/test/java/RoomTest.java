import Characters.Cleric;
import Characters.Enemy;
import Characters.Warrior;
import CharactersInventory.Healing;
import CharactersInventory.Weapon;
import org.junit.Before;

import java.util.ArrayList;

public class RoomTest {

    Room room;
    Warrior warrior;
    Enemy enemy;
    Weapon weapon;
    Weapon weapon1;
    Cleric cleric;
    Healing healing;


    @Before
    public void before(){
        weapon = new Weapon("axe", 20);
        weapon1 = new Weapon("Club", 10);
        healing = new Healing("potion", 15);
        cleric = new Cleric("Padre", healing);
        warrior = new Warrior("Barbarian", weapon, new ArrayList<>(), 100)
        enemy = new Enemy("Orc", 70);
        room = new Room ("Gimli", enemy);
    }
}
