package cars;

public class Test {

	public static void main(String[] args) {
		Car car = new Car(2002, "Honda");
		car.printInfo();
		Motor motor = new Motor(2009, "Yamaha");
		motor.printInfo();
		car.move();
		motor.move();

	}

}
