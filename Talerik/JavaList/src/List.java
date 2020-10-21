import java.util.Arrays;

public class List<T> implements Comparable{

	private Object[] array = new Object[2];
	int index = 0;
	
	public int size(){
		return this.array.length;
	}
	
	public void add(T object) {
		Object[] newArray = new Object[size()+1];
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		newArray[newArray.length-1] = object;
		this.array = newArray;
	}
	
	public void remove(int index) {
		Object[] newArray = new Object[size() - 1];
		
		for(int i = 0; i < index; i++) {			
			newArray[i]= array[i];			
		}
		
        for(int i = index + 1; i < array.length; i++){			
			newArray[i-1]= array[i];			
		}
        
        this.array = newArray;		
	}
	
	public void print() {
		System.out.println(Arrays.toString(this.array));
	}
	
	public Object get(int index) {
		return this.array[index];
	}
	
	public void replace(T replaceObject, int index) {
		this.array[index] = replaceObject;
	}

	public void sort() {
		
		
	}

	@Override
	public boolean isLessThan(Object obj) {
		
		return false;
	}
}