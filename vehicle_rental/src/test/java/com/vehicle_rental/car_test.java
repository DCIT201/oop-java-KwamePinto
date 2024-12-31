

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCalculateRentalCost() {
        Car car = new Car("CAR001", "Toyota Corolla", 50.0, 5);
        double cost = car.calculateRentalCost(3); // 3 days
        assertEquals(150.0, cost, "Rental cost for 3 days should be 150.0");
    }

    @Test
    void testIsAvailableForRental() {
        Car car = new Car("CAR002", "Honda Civic", 60.0, 5);
        assertTrue(car.isAvailableForRental(), "Car should initially be available for rental");
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Car should no longer be available for rental");
    }

    @Test
    void testEncapsulation() {
        Car car = new Car("CAR003", "Ford Focus", 55.0, 5);
        car.setAvailable(true);
        assertTrue(car.isAvailable(), "Encapsulation test failed for availability");
        car.setAvailable(false);
        assertFalse(car.isAvailable(), "Encapsulation setter failed");
    }

    @Test
    void testInvalidData() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Car("CAR004", "Mazda 3", -10.0, 5); // Invalid rental rate
        });
        assertEquals("Base rental rate must be positive", exception.getMessage());
    }
}
