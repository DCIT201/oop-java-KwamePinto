public class car extends  Vehicle {
package JAVA-OOP;

public class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate, int seatingCapacity) {
        super(vehicleId, model, baseRentalRate);
         this.seatingCapacity = seatingCapacity;
    }

    
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days; 
    }

    
    public boolean isAvailableForRental() {
        return getAvailability();
    }

    
    public void rent(Customer customer, int days) {
        if (!isAvailableForRental()) {
            System.out.println("Car is not available for rental.");
        }
        setAvailability(false);
        System.out.println("Car rented to customer for " + days + " days.");
    }

    
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Car returned.");
    }
}


  
  

}
