import org.junit.Test;

public class UItesting {

	@Test
	public void modifierTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.setKey("abc ac");
		logic.setTextForCoding("abc se");
		logic.modifyTheWords();
	}
	
	@Test
	public void checkIfTheLetterIsInTheMatrixTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.setKey("abc ac");
		logic.fillLettersFromTheKey();
		System.out.println(logic.checkIfTheLetterIsInTheMatrix('a'));
	}
	
	@Test
	public void takeEncounteredLetterXTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.takeEncounteredLetterX('A');
	}
	
	@Test
	public void takeEncounteredLetterYTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.takeEncounteredLetterY('A');
	}
	
	@Test
	public void showTheTextForCodingTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.setTextForCoding("abc se");
		logic.showTheTextForCoding();
	}
	
	@Test
	public void showTheCodedTextTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.setTextForCoding("abc se");
		logic.showTheCodedText();
	}
	
	@Test
	public void fillLettersFromTheKeyTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.setKey("abc ac");
		logic.fillLettersFromTheKey();
	}
	
	@Test
	public void fillLettersFromTheAlphabetTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.fillLettersFromTheAlphabet(0, 0);
	}
	
	@Test
	public void matrixPrintTest() {
		
		MainLogicClass logic = new MainLogicClass();
		
		logic.printMatrix();
	}

}
