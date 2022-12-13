
public class Car {
	public String brand ;
	public String model;
	public int amountOfFuel;
	public Car () {
		this.brand = "";
		this.model = "";
		this.amountOfFuel = 0;
		printData();
	}
	
	public Car (String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		printData();
	}
	
	public void brake() {
		System.out.println("Car is breaking");
	}
	public void accelerate() {
		System.out.println("Car is accelerating");
		this.amountOfFuel = this.amountOfFuel - 1;
	}
	
	public void refuel(int refuel) {
		System.out.println("Fuel on the tank: "+this.amountOfFuel);
		this.amountOfFuel = this.amountOfFuel + refuel;
		System.out.println("Refuel: "+ refuel);
		System.out.println("Fuel on the tank after the refuel: " +this.amountOfFuel);
	}
	
	public void printData() {
		System.out.println("Brand: " +this.brand);
		System.out.println("Model: " +this.model);
		System.out.println("Amount of fuel: " + this.amountOfFuel);
	}
}
