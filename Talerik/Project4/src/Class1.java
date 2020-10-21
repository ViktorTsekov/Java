import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,i,j;
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println();
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
		}
		for(i=n;i>=0;i--)
		{
			System.out.println();
			for(j=i;j>=0;j--)
			{
				System.out.print("*");
			}
		}
	}
    
}