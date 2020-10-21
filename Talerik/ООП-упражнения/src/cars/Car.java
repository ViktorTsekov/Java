package cars;

public class Car extends Vehicle{

	String brand;
	int year;
	
	public Car(int year, String model) {
		super(year, model);
		this.brand = model;
		this.year = year;
	}

	@Override
	public void move() {
		System.out.println("4 wheels vroom");
	}
	
	@Override
	public void printInfo() {
		System.out.println(brand + ", " + year + " year");
	}
}
