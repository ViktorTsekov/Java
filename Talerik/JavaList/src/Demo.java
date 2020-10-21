
public class Demo {

	public static <T> T print(T obj) {
		System.out.println(obj.getClass().getTypeName());
		return obj;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new List<>();
		
		list.add(1);
		list.add(2);
		
		list.print();
		
	    System.out.println(print("sad"));
	}

}
