import java.util.Scanner;
public class Class2 {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=input.nextInt();
        String formatted = String.format("Name: %s, Age: %d", "Tito", 26);
        System.out.println(formittedNumbers(number));
        System.out.printf("Name: %s, Age: %d years, Lives in %s", "Ivan", 25, "Vratsa");
	}
	
	public static String formittedNumbers(int n)
	{
		StringBuilder numbers = new StringBuilder();
		for(int i = 1; i <= n; i++)
		{
			String currNumber = i + "";
			numbers = numbers.append(currNumber).append(", ");
		}
		
		 return numbers.toString();
	}
}
