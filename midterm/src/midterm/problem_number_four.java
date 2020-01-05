package midterm;

public class problem_number_four {

	//Creating the fuelGauge Class
	public static class FuelGauge {

	    final static int Max_Gallons = 20;

	    private int gallons;

	    public FuelGauge() {
	        gallons = 0;
	    }

	    public FuelGauge(int gallons) {
	        if (gallons <= Max_Gallons) {
	            this.gallons = gallons;
	        } else {
	            gallons = Max_Gallons;
	        }
	    }

	    public int getGallons() {
	        return gallons;
	    }

	    public void addGallons() {
	        if (gallons < Max_Gallons) {
	            gallons++;
	        } else {
	            System.out.println("Too much fuel");
	        }
	    }

	
	    public void burnFuel() {
	        if (gallons > 0) {
	            gallons--;
	        } else {
	            System.out.println("You are out of fuel");
	        }
	    }
	
}
	
	public static class Odometer {

	    // Maximum mileage
	    public final int Max_Mileage = 999999;

	    //miles per gallon constant
	    public final int MPG = 24;

	    private int initialMileage;
	    private int mileage;

	    // reference for fuel gauge
	    private FuelGauge fuelGauge;

	    public Odometer(int mileage, FuelGauge fuelGauge) {
	        this.initialMileage = mileage;
	        this.mileage = mileage;
	        this.fuelGauge = fuelGauge;
	    }

	    public int getMileage() {
	        return mileage;
	    }

	    public void addMileage() {

	        if (mileage < Max_Mileage) {
	            mileage++;
	        } else {
	            mileage = 0;
	        }

	        int driven = initialMileage - mileage;
	        if (driven % MPG == 0) {
	            fuelGauge.burnFuel();
	        }
	    }
	}
		
	public static void main(String[] args) {

	    FuelGauge fuel = new FuelGauge();
	    Odometer odometer = new Odometer(0, fuel);

	    for (int x = 0; x < FuelGauge.Max_Gallons; x++) {
	        fuel.addGallons();
	    }

	    // while loop that goes until the car cannot drive any longer
	    while (fuel.getGallons() > 0) {

	        // addition of mile(s) driven
	        odometer.addMileage();

	        // Generate the mileage and display it
	        System.out.println("Current Mileage: " + odometer.getMileage());

	        // Generate the amount of fuel and displa it
	        System.out.println("Current Fuel level: " + fuel.getGallons() + " gallons");
	        System.out.println("------------------------------");
	    }
	}
	
}

	
