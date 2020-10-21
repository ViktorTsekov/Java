
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter dogs");
        int dogsNumber = input.nextInt();
        Dog[] dogs = new Dog[dogsNumber];
        
        input.nextLine();
        
        for(int i=0; i<dogsNumber; i++){
        	dogs[i] = new Dog(input.nextLine());
        }
        
        System.out.println(Dog.serialNumber);
        
	}

}
