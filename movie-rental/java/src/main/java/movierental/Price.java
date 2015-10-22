package movierental;

public abstract class Price {
	abstract int getPriceCode();
	abstract double getCharge(int daysRented);
}
