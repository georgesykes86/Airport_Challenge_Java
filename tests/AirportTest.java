import mockit.Expectations;
import mockit.Injectable;
import mockit.Verifications;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


class AirportTest {

    private Airport airport;

    @Injectable
    private Plane plane;

    @BeforeEach
    public void setUp() {
        airport = new Airport();
        airport.storePlane(plane);
    }

    @Test
    public void hasNoPlanesOnCreation() {
        Airport airport2 = new Airport();
        assertEquals(0, airport2.planes.size());
    }

    @Test
    public void capacitySetToDefault() {
        assertEquals(airport.CAPACITY, airport.capacity);
    }

    @Test
    public void capacitySetOnInitialisation() {
        int capacity = 10;
        Airport newAirport = new Airport(capacity);
        assertEquals(newAirport.capacity, capacity);
    }

    @Test
    public void tellsPlaneToLand() {
        new Verifications() {{ plane.land(); times = 1; }};
    }

    @Test
    public void storesPlane() {
        assertTrue(airport.planes.contains(plane));
    }

    @Test
    public void releasesPlane() {
        airport.releasePlane(plane);
        new Verifications() {{ plane.takeOff(); times = 1; }};
    }

    @Test
    public void removeesPlaneFromPlanesOnRelease() {
        airport.releasePlane(plane);
        assertFalse(airport.planes.contains(plane));
    }

    @Test
    public void doesNotReleasePlaneWhenAlreadyFlying() {
        new Expectations() {{
            plane.takeOff(); result = new Error("Plane already flying");
        }};

        Throwable error = assertThrows(Error.class, () -> { airport.releasePlane(plane); });
        assertEquals("Plane already flying", error.getMessage());
    }

}