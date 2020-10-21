package cars;

public class Motor extends Vehicle{

	String brand;
	int year;
	
	public Motor(int year, String model) {
		super(year, model);
		this.brand = model;
		this.year = year;
	}

	@Override
	public void move() {
		System.out.println("2 wheels vroom");
	}

	@Override 
	public void printInfo() {
		System.out.println(brand + ", " + year + " year");
	}
}
