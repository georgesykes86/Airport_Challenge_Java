import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    private Plane plane;

    @BeforeEach
    public void setupForTests() {
        plane = new Plane();
    }

    @Test
    public void testPlaneIsCreatedNotFLying() {
        assertFalse(plane.isFlying());
    }

    @Test
    public void testPlaneIsNotFlyingWhenTakenOff() {
        plane.takeOff();
        assertTrue(plane.isFlying());
    }

    @Test
    public void testPlaneIsNotFlyingAfterBeingToldToLand() {
        plane.takeOff();
        plane.land();
        assertFalse(plane.isFlying());
    }

    @Test
    public void testPlaneCannotLandWhenNotFlying() {
        assertThrows(Error.class, () -> {
            plane.land();
        }, "Plane already on the ground");
    }

    @Test
    public void testPlaeCannotTakeOffWhenAlreadyFlying() {
        plane.takeOff();
        assertThrows(Error.class, () -> {
          plane.takeOff();
        }, "Plane already flying");
    }


}