
public class Test {

	public static void main(String[] args) {
		Object[] list = {1,2,3,4,5};
		CustomArray myArray = new CustomArray(list);
        System.out.println(myArray.get(2));
        myArray.replace(2,2);
        System.out.println(myArray.get(2));
        System.out.println(myArray.size());
        myArray.add(10);
        System.out.println(myArray.size());
        System.out.println(myArray.get(5));
        myArray.remove(5);
        myArray.print();
        myArray.reverse();
        myArray.print();
        myArray.sort();
        myArray.print();
	}

}
