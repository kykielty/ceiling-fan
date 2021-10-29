import com.medavie.blue.cross.CeilingFan;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Junit tests for the CeilingFan class.
 * Author: Kyla Kieltyka
 * Date: October 24th, 2021
 */
public class CeilingFanTest {

    CeilingFan ceilingFan;

    @Before
    public void setUp(){
        ceilingFan = new CeilingFan();
    }

    @Test
    public void testSpeedStart(){
        assertEquals(CeilingFan.STARTING_SPEED, ceilingFan.getSpeed());
    }

    @Test
    public void testSpeed1(){
        ceilingFan.pullSpeedCord();
        assertEquals(1, ceilingFan.getSpeed());
    }

    @Test
    public void testSpeed2(){
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        assertEquals(2, ceilingFan.getSpeed());
    }

    @Test
    public void testSpeed3(){
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        assertEquals(3, ceilingFan.getSpeed());
    }

    @Test
    public void testSpeed0(){
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        ceilingFan.pullSpeedCord();
        assertEquals(0, ceilingFan.getSpeed());
    }

    @Test
    public void testDirectionStart(){
        assertEquals(CeilingFan.STARTING_DIRECTION, ceilingFan.isDirectionClockwise());
    }

    @Test
    public void testDirectionClockwise(){
        ceilingFan.pullDirectionCord();
        ceilingFan.pullDirectionCord();
        assertEquals(CeilingFan.DIRECTION_CLOCKWISE, ceilingFan.isDirectionClockwise());
    }

    @Test
    public void testDirectionClockwiseText(){
        ceilingFan.pullDirectionCord();
        ceilingFan.pullDirectionCord();
        assertEquals(CeilingFan.DIRECTION_CLOCKWISE_TEXT, ceilingFan.getDirectionText());
    }

    @Test
    public void testDirectionCounterClockwise(){
        ceilingFan.pullDirectionCord();
        assertEquals(CeilingFan.DIRECTION_COUNTERCLOCKWISE, ceilingFan.isDirectionClockwise());
    }

    @Test
    public void testDirectionCounterClockwiseText(){
        ceilingFan.pullDirectionCord();
        assertEquals(CeilingFan.DIRECTION_COUNTERCLOCKWISE_TEXT, ceilingFan.getDirectionText());
    }

}
