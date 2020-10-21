import java.util.Scanner; 
public class Class1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int []numbers=new int[20];
		boolean f=false;
		int i,n;
		System.out.println("Enter lenght of the Array: ");
		n=scan.nextInt();
		System.out.println("Enter elements: ");
		for(i=0;i<n;i++)
		{
			numbers[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(numbers[i]==6)
			{
				if(i==0||i==n-1) f=true;
			}
		}
		System.out.println(f);
	}
//GFrame
}