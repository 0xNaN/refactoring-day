package movierental;

public abstract class Price {
	abstract int getPriceCode();
	
	public double getCharge(int daysRented) {
    	double result = 0;
	    switch (getPriceCode()) {
	        case Movie.NEW_RELEASE:
	            result += daysRented * 3;
	            break;
	        case Movie.CHILDRENS:
	            result += 1.5;
	            if (daysRented > 3)
	                result += (daysRented - 3) * 1.5;
	            break;
	    }
	    return result;
    }
}
