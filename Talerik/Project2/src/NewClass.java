import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		int month = 0;
		int score=123;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number between 1 and 9: ");
		month = input.nextInt();
		switch (month) {
		case 1:
			score*=10;
			System.out.println(score);
			break;
		case 2:
			score*=10;
			System.out.println(score);
			break;
		case 3:
			score*=10;
			System.out.println(score);
			break;
		case 4:
			score*=100;
			System.out.println(score);
			break;
		case 5:
			score*=100;
			System.out.println(score);
			break;
		case 6:
			score*=100;
			System.out.println(score);
			break;
		case 7:
			score*=1000;
			System.out.println(score);
			break;
		case 8:
			score*=1000;
			System.out.println(score);
			break;
		case 9:
			score*=1000;
			System.out.println(score);
			break;
		default:
			System.out.println("Invalid Number");
			break;
		}
	}

}