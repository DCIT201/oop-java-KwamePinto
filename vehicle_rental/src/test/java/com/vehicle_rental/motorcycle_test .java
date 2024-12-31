

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testCalculateRentalCost() {
        Motorcycle motorcycle = new Motorcycle("MOTO001", "Harley Davidson", 30.0, true);
        double cost = motorcycle.calculateRentalCost(5); // 5 days
        assertEquals(150.0, cost, "Rental cost for 5 days should be 150.0");
    }

    @Test
    void testIsAvailableForRental() {
        Motorcycle motorcycle = new Motorcycle("MOTO002", "Ducati Monster", 40.0, true);
        assertTrue(motorcycle.isAvailableForRental(), "Motorcycle should initially be available");
        motorcycle.setAvailable(false);
        assertFalse(motorcycle.isAvailableForRental(), "Motorcycle should no longer be available");
    }

    @Test
    void testSpecialFeatures() {
        Motorcycle motorcycle = new Motorcycle("MOTO003", "Kawasaki Ninja", 35.0, false);
        assertFalse(motorcycle.hasHelmetIncluded(), "Helmet feature should be false");
    }
}
