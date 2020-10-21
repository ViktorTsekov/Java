import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		Scanner fileReader = null;
		
		String word;
		String mostCommonWord = null;
		String hidedWord = "";
		int count = 0;
		int maxCount = 0;
		
		try {
			 fileReader = new Scanner(new File("File.txt"),"UTF-8");
			
			 while (fileReader.hasNext()) {
				    count = 0;
			        word = fileReader.next();
			        
			        while (fileReader.hasNext()) {					 				        
					        if(word.equals(fileReader.next())) {
					        	count++;
					        }			        
					    }
			        
			        if(count > maxCount) {
			        	maxCount = count;
			        	mostCommonWord = new String(word);
			        }	
			        
			    }			
		} catch (Exception e) {
			System.out.println("Error found");
		} 
		
		for(int i = 0; i < mostCommonWord.length(); i++) {
			hidedWord += "*";
		}
		
		PrintStream fileWriter = null;
		String regularWord;
		
		try {		
			fileReader = new Scanner(new File("File.txt"),"UTF-8");
			fileWriter = new PrintStream("NewFile.txt", "UTF-8");
			 
			 while (fileReader.hasNext()) {				 
			    	regularWord = fileReader.next();;
				 
			        if(mostCommonWord.equals(regularWord)) {
			        	fileWriter.print(hidedWord + " ");
			        } else {
			        	fileWriter.print(regularWord + " ");
			        }	
			        
			    }
		} catch (Exception e) {
			System.out.println("Error found");
		} finally {
			fileReader.close();
		 	fileWriter.close();
	        System.out.println("Files closed");
		}
		
	}

}
