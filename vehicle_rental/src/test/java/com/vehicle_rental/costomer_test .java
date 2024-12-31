package com.vehicle.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testRentalHistory() {
        Customer customer = new Customer("John Doe");
        Car car = new Car("CAR001", "Honda Civic", 60.0, 5);

        customer.rentVehicle(car);
        assertTrue(customer.getRentalHistory().contains(car), "Rental history should include the rented vehicle");
    }

    @Test
    void testEligibility() {
        Customer customer = new Customer("John Doe");
        assertTrue(customer.isEligibleForRental(), "Customer should be eligible for rental initially");
    }
}
