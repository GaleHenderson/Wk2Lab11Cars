package wk2Lab11Cars;

public class UsedCar extends Cars {

	private double milage;

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(int year, String make, String model, double price) {
		super(year, make, model, price);
		// TODO Auto-generated constructor stub
	}

	public UsedCar(int year, String make, String model, double price, double milage) {
		super(year, make, model, price);
		this.milage = milage;
		// TODO Auto-generated constructor stub
	}

	public UsedCar(double milage) {
		this.milage = milage;
	}
	
	public String toString(){
	return super.toString()	 + String.format("Milage: %-10f", milage);
	}
	
}
