import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setupForTests() {
        plane = new Plane();
    }

    @Test
    public void testPlaneIsCreatedNotFLying() {
        assertTrue(plane.isFlying());
    }

    @Test
    public void testPlaneIsNotFlyingAfterBeingToldToLand() {

    }


}