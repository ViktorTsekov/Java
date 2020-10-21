import java.util.Arrays;
import java.util.List;

public class GenericsDemo {

	public static void Numbers(List<? extends Number> numbers) {
		double d = 0.0; 
		
		for(Number n : numbers) {
			d += n.doubleValue();
		}
		
		System.out.println(d);
	}
	
	public<T extends Number> void NumbersVariantTwo(List<T> numbers) {
		double d = 0.0; 
		
		for(Number n : numbers) {
			d += n.doubleValue();
		}
		
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Generic<Integer, String> p1 = new Generic<>(123, "value");
		Box<String> box = new Box<String>();
		
		box.setObject("string");
		box.inspect(123.0);
		
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		
		p1.printData(124, "string");
		
		Numbers(Arrays.asList(1,2,3));
	}

}
