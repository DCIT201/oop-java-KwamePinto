

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void testCalculateRentalCost() {
        Truck truck = new Truck("TRUCK001", "Ford F-150", 100.0, 1000.0);
        double cost = truck.calculateRentalCost(2); // 2 days
        assertEquals(200.0, cost, "Rental cost for 2 days should be 200.0");
    }

    @Test
    void testOverweightCharges() {
        Truck truck = new Truck("TRUCK002", "Chevy Silverado", 120.0, 800.0);
        double cost = truck.calculateRentalCost(3); // 3 days
        assertEquals(360.0, cost, "Rental cost for 3 days should be 360.0 (no overweight charges)");
    }

    @Test
    void testInvalidCapacity() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck("TRUCK003", "Ram 1500", 90.0, -500.0); // Invalid capacity
        });
        assertEquals("Capacity must be positive", exception.getMessage());
    }
}
