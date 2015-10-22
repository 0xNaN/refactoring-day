package movierental;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each: _rentals) {
        	// show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";

        return result;
    }
    
    public int getTotalFrequentRenterPoints() {
    	int result = 0;
    	for (Rental each: _rentals) {
        	result += each.getFrequentRenterPoints();
        }
    	return result;
    }
    
    public double getTotalCharge() {
    	double totalAmount = 0;
    	for (Rental each: _rentals) {
            totalAmount += each.getCharge();
        }
    	return totalAmount;
    }
}
