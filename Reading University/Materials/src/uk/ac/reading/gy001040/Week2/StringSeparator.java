package uk.ac.reading.gy001040.Week2;

public class StringSeparator {
	
	private String separator;
	private String str;
	
	public StringSeparator(String sep, String str) {
		separator = sep;
		this.str = str;
	}
	
	public String[] getStrings() {
		var manyStrings = str.split(separator);
   	 	return manyStrings;
	}

	public static void main(String[] args) {
		StringSeparator sp = new StringSeparator(" ", "1 32 4 5");
		var strings = sp.getStrings();
		
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
		
	}

}
