package com.vehicle.rental;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency 
    private List<Vehicle> garage;

    public RentalAgency() {
        this.garage = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        garage.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> available = new ArrayList<>();
        for (Vehicle vehicle : garage) {
            if (vehicle.isAvailableForRental()) {
                available.add(vehicle);
            }
        }
        return available;
    }

    public Vehicle findVehicleById(String vehicleId) {
        for (Vehicle vehicle : garage) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        system.out.println ("Vehicle not found.");
    }
 
