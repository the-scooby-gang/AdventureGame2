import Characters.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Orc", 80);
    }

    @Test
    public void getEnemyType(){
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void getEnemyXP(){
        assertEquals(80, enemy.getXP());
    }
}
