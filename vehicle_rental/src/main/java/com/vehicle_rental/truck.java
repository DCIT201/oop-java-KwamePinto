

public class Truck extends Vehicle  {
    private static final double EXTRA_COST_PER_DAY = 20.0;

    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    
    public double calculateRentalCost(int days) {
        return (getBaseRentalRate() + EXTRA_COST_PER_DAY) * days; 
    }

    
    public boolean isAvailableForRental() {
        return getAvailability();
    }

    
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            System.out.println ("Truck is not available for rental.");
        }
        setAvailability(false);
        System.out.println("Truck rented to customer for " + days + " days.");
    }

    
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Truck returned.");
    }
}
