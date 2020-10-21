
public class Func {
    public static void Books(double[] booksPrice)
    {
    	double sum=0;
    	for(int i=0;i<booksPrice.length;i++)
    	{
    		sum+=booksPrice[i];
    	}
    }
    public static boolean odd(int a)
    {
    	if(a%2!=0)
    	{
    		return true;
    	}
    	if(a%2==0)
    	{
    		return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
		double[] booksPrice={3,12,4,18,4,2};
    	int a=2;
    	System.out.println(odd(a));
	}
}
