

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name) {
        if (customerId == null || name == null || customerId.isEmpty() || name.isEmpty()) {
            system.out.println("Customer details cannot be null or empty.");
        }
        this.customerId = customerId;
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRentalHistory(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public String toString() {
        return String.format("Customer[ID: , Name: ]", customerId, name);
    }
    
}

