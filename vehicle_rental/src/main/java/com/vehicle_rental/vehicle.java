public abstract class Vehicle {

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;



    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();

    public String getvehicle() {
        return vehicleId;
    }

    public String getmodel() {
        return model;
    }

    public double getbaseRentalRate() {
        return baseRentalRate;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    
}
