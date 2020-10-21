import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class People {

	static ArrayList<String> fileNames = new ArrayList<String>();
	
	public static void main(String[] args) {
		Scanner fileReader = null;
		
		try {			
		   	fileReader = new Scanner(new File("Sample.txt"),"UTF-8");
			
			 while (fileReader.hasNext()) {
			        String name = fileReader.next();		        
			        fileNames.add(name);
			    }
			
		} catch (Exception e) {
			System.out.println("Error has occured");
		} 
		
		fileNames.sort(null);
		PrintStream fileWriter = null;

		try {			
			 fileWriter = new PrintStream("NewFile.txt", "UTF-8");
			 
			 for(int i=0;i<fileNames.size();i++) {
				 fileWriter.println(fileNames.get(i));
			 }
			
		} catch (Exception e) {
			System.out.println("Error has occured");
		} 
		
		try {			
		   	fileReader = new Scanner(new File("NewFile.txt"),"UTF-8");
			
			 while (fileReader.hasNext()) {	        
			        System.out.println(fileReader.next());
			    }
			
		} catch (Exception e) {
			System.out.println("Error has occured");
		} 
		
		fileReader.close();
        fileWriter.close();
	}

}
