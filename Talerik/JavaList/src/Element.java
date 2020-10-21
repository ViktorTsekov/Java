
public class Element {
	String s;
	int value;
	
	public Element(int value) {
		this.value = value;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Element) {
			return value == ((Element) obj).value;
		}
		
		return false;
	}

}
