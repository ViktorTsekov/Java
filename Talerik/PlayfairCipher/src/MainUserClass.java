import java.util.Scanner;

public class MainUserClass {		
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MainLogicClass logic = new MainLogicClass();
		
		System.out.print("Enter key: ");
		String key = input.nextLine();
		
		System.out.print("Enter text for coding: ");
		String textForCoding = input.nextLine();
		
		logic.setKey(key);
		logic.setTextForCoding(textForCoding);
		
		logic.modifyTheWords();
        logic.fillLettersFromTheKey();
        logic.printMatrix();
        
        System.out.println();
        
        logic.showTheTextForCoding();
        logic.showTheCodedText();
      
	}

}
