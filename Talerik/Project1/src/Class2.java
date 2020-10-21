import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		int S=0,a;
		int b,c,v;
			Scanner input = new Scanner(System.in);
			a=input.nextInt();
			S+=a%10;
			S+=a%100/10;
			S+=a/100;
			System.out.println(S);
		    c=a/100;
		    b=a%100/10;
		    v=a%10;
		    System.out.println(""+c+b+v);
		    System.out.println(""+v+b+c);

	}

}
