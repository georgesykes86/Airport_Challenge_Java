import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    private Airport airport;

    @BeforeEach
    public void setUp() {
        airport = new Airport();
    }

    @Test
    public void hasNoPlanesOnCreation() {
        assertEquals(0, airport.planes.size());
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
    public void storesPlane() {

    }


}