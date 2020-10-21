
import java.util.*;

public class Dog {
	
	private String name;
	private byte age;
	static Scanner input = new Scanner(System.in);
	
	public Dog(String name) {
		super();
		this.name = name;
		this.age = 6;
	}
	
	public Dog(String name, byte age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
        	this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(byte age) {
		
		if(age > 0 && age < 15) {
			this.age = age;
		} else {
			System.out.println("Input new nunber: ");
			setAge(input.nextByte());
		}
	}

	public static void main(String[] args) {
		
		 Dog sharo = new Dog("Sharo",(byte)2);
		 sharo.setAge(input.nextByte());
		 System.out.println(sharo.getAge());
	}

}
