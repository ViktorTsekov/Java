import java.util.Scanner;
public class Address {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] Adresses = new String [5];
		String reciever;
		String country;
		String city;
		String address;
		String postCode;
		System.out.println("Enter reciever: ");
		reciever = input.next();
		System.out.println("Enter country: ");
		country = input.next();
		System.out.println("Enter city: ");
		city = input.next();
		System.out.println("Enter address: ");
		address = input.next();
		input.next();
		System.out.println("Enter post code: ");
		postCode = input.next();
		Adresses[0] = reciever;
		Adresses[1] = country;
		Adresses[2] = city;
		Adresses[3] = address;
		Adresses[4] = postCode;
		Print(Adresses);
	}
	
	public static void Print(String[] ad)
	{
		System.out.printf("Name: %s, Country: %s City: %s, Address: %s, Post Code: %s", ad[0], ad[1], ad[2], ad[3], ad[4]);
	}

}
