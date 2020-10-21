
import java.io.File;
import java.util.*;

public class FileDemo {

	public static void main(String[] args) {
		
		int count = 0;
		String word = "Ivan";
		
		String fileName = "Sample.txt";
		Scanner fileReader = null;
		
		try {			
			fileReader = new Scanner(new File(fileName));
			
			 while (fileReader.hasNext()) {
			        String fileWord = fileReader.next();
			        
			        if(fileWord.equals(word)) {
			        	count++;
			        }
			    }
			
		} catch (Exception e) {
			System.out.println("Error has occured");
		} 
		
		fileReader.close();
		System.out.println(word + " has occured " + count + " times");
	}

}
