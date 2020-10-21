
import java.util.*;

public class CustomArray {

	private Object[] array;
	
	public CustomArray(Object[] array) {
		this.array = array;
	}
	
	public int size(){
		return this.array.length;
	}
	
	public void add(Object object) {
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
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}		
		return false;
	}
	
	public void reverse() {
		Object[] newArray = new Object[size()];
		int index = 0;
		
		for(int i = size() - 1; i >= 0; i--){
			newArray[index] = this.array[i];
			index++;
		}
		
		this.array = newArray;		
	}
	
	public void sort() {
		Arrays.sort(this.array);
	}
	
	public void swap(int firstIndex, int secondIndex) {
		Object temp;
		temp = this.array[firstIndex];
		this.array[firstIndex] = this.array[secondIndex];
		this.array[secondIndex] = temp;
	}
	
	public void print() {
		System.out.println(Arrays.toString(this.array));
	}
	
	public Object get(int index) {
		return this.array[index];
	}
	
	public void replace(Object replaceObject, int index) {
		this.array[index] = replaceObject;
	}

}
