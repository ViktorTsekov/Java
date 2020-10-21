import java.util.Scanner;

public class Test{

	public static <T> void printArray(T[] arr){
		
	    for(T t: arr){
	       System.out.print(t + " ");
	    }
	    
	    System.out.println();
	}
	
	public static<T extends Comparable> Object maximum(T[] arr) {						
		T max = arr[0];
        
		for (int i = 1; i < arr.length; i++) {
			
		    if (arr[i] instanceof Comparable) {
		      max = arr[i];
		    }
		    
		}
		
		return max;
	}
	
	public static void main( String args[] ) {
        // Create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        
        System.out.println(doubleArray.getClass().getName());
        
        System.out.println( "Array integerArray contains:" );
        printArray( intArray  ); // pass an Integer array

        System.out.println( "\nArray doubleArray contains:" );
        printArray( doubleArray ); // pass a Double array

        System.out.println( "\nArray characterArray contains:" );
        printArray( charArray ); // pass a Character array
 
        System.out.println(maximum(doubleArray));
        
        Scanner scan = new Scanner(System.in, "UTF-8");
        scan.close();
    }
	
}
