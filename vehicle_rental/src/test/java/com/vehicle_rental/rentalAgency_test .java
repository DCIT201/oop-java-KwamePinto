

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    void testAddVehicle() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("CAR001", "Toyota Prius", 50.0, 5);
        agency.addVehicle(car);
        assertTrue(agency.getVehicles().contains(car), "Car should be added to the fleet");
    }

    @Test
    void testRentVehicle() {
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("John Doe");
        Car car = new Car("CAR001", "Toyota Prius", 50.0, 5);
        agency.addVehicle(car);

        assertTrue(agency.rentVehicle(car, customer, 2), "Vehicle rental should succeed");
        assertFalse(car.isAvailable(), "Car should no longer be available after rental");
    }

    @Test
    void testGenerateReport() {
        RentalAgency agency = new RentalAgency();
        Car car = new Car("CAR001", "Toyota Prius", 50.0, 5);
        agency.addVehicle(car);

        String report = agency.generateReport();
        assertTrue(report.contains("Toyota Prius"), "Report should contain the car details");
    }
}
