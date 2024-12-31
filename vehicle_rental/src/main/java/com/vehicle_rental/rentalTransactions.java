
import java.time.LocalDate;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate rentalDate;
    private int rentalDays;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.rentalDate = LocalDate.now();
    }

     public String toString() {
        return String.format("RentalTransaction[Customer: , Vehicle: , Days: , Date: ]", 
            customer, vehicle, rentalDays, rentalDate);

   
}
