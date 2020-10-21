import java.util.Scanner;

public class ZamenqneNaSimvoli {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1=input.nextLine();
        String replaced = str1.replace("Java", "PHP");
        System.out.println(replaced);
	}

}
