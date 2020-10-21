package cars;

public class Vehicle implements vehicleProperties{

	int year;
	String model;
	
	public Vehicle(int year, String model) {
		this.year = year;
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}

	public String getModel() {
		return model;
	}

	public void move(){
		System.out.println("vroom");
	}
	
	public void printInfo(){

	}
}
