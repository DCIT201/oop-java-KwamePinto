public class motorcycle extends Vehicle {

    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; 
    }

    
    public boolean isAvailableForRental() {
        return getAvailability();
    }

    
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            System.out.println("Motorcycle is not available for rental.");
        }
        setAvailability(false);
        System.out.println("Motorcycle rented to customer for " + days + " days.");
    }

    
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Motorcycle returned.");
    }
}

