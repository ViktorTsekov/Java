
public class MainLogicClass {
	
	private char matrix[][] = new char[5][5];
	private char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R',
	        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private String key;
	private String textForCoding;
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public void setTextForCoding(String textForCoding) {
		this.textForCoding = textForCoding;
	}
	
	public void modifyTheWords() {
		
		this.key = key.toUpperCase();
		this.key = key.replaceAll(" ", "");
		this.key = key.replaceAll("Q", "");
		
		this.textForCoding = textForCoding.toUpperCase();
		this.textForCoding = textForCoding.replaceAll(" ", "");
		
		if(textForCoding.length() % 2 != 0 ) {
			this.textForCoding = new String (textForCoding + "Z");
		}	
		
	}
	
	public boolean checkIfTheLetterIsInTheMatrix(char Letter) {
		
		char presentMatrixLetter;
		
		for (int row = 0; row < matrix.length; row++)
		{
		    for (int col = 0; col < matrix[row].length; col++)
		    {
		    	presentMatrixLetter = matrix[row][col];			       
		    	
		    	if(presentMatrixLetter == Letter) return true;		  			    	
		    	
		    }
		    
		}
		
		return false;
		
	}
	
	public int takeEncounteredLetterX(char Letter) {
		
		char presentMatrixLetter;
		
		for (int row = 0; row < matrix.length; row++)
		{
		    for (int col = 0; col < matrix[row].length; col++)
		    {
		    	presentMatrixLetter = matrix[row][col];			       
		    	
		    	if(presentMatrixLetter == Letter) return row;		  			    	
		    	
		    }
		    
		}
		
		return 0;
		
	}
	
	public int takeEncounteredLetterY(char Letter) {
		
		char presentMatrixLetter;
		
		for (int row = 0; row < matrix.length; row++)
		{
		    for (int col = 0; col < matrix[row].length; col++)
		    {
		    	presentMatrixLetter = matrix[row][col];			       
		    	
		    	if(presentMatrixLetter == Letter) return col;		  			    	
		    	
		    }
		    
		}
		
		return 0;
		
	}
	
	public void fillLettersFromTheKey() {
		
		int rowForPuttingLetter = 0;
		int columnForPuttingLetter = 0;
		
		boolean theLettersAreTheSame;
		
		char presentKeyLetter;
		
		for(int i = 0; i < key.length(); i++) {
			presentKeyLetter = key.charAt(i);
			
			theLettersAreTheSame = checkIfTheLetterIsInTheMatrix(presentKeyLetter);

			if(!theLettersAreTheSame) {
				
				matrix[rowForPuttingLetter][columnForPuttingLetter] = presentKeyLetter;
				
				columnForPuttingLetter++;
				
				if(columnForPuttingLetter > 4) {
					
					columnForPuttingLetter = 0;
					rowForPuttingLetter++;
					
					if(rowForPuttingLetter > 4) { i = key.length(); }
					
				}
				
			} 
				
		}
		
		fillLettersFromTheAlphabet(rowForPuttingLetter, columnForPuttingLetter);
		
	}
	
	public void fillLettersFromTheAlphabet(int lastRow, int lastColumn) {	
		
		int rowForPuttingLetter = lastRow;
		int columnForPuttingLetter = lastColumn;
		
		boolean theLettersAreTheSame;
		
		char presentAlphabetLetter;
		
		for(int i = 0; i < alphabet.length; i++) {
			
			presentAlphabetLetter = alphabet[i];
			
			theLettersAreTheSame = checkIfTheLetterIsInTheMatrix(presentAlphabetLetter);
			
			if(!theLettersAreTheSame) {
				matrix[rowForPuttingLetter][columnForPuttingLetter] = presentAlphabetLetter;
				
				columnForPuttingLetter++;
				
				if(columnForPuttingLetter > 4) {
					
					columnForPuttingLetter = 0;
					rowForPuttingLetter++;
					
					if(rowForPuttingLetter > 4) { i = alphabet.length; }					
					
				}
				
			}
			
		}
		
	}
	
	public void showTheTextForCoding() {
		
		char firstLetterFromTheText;
		char secondLetterFromTheText;
		
		System.out.println("Text for coding: ");
		
		for(int i = 0; i < textForCoding.length() - 1;  i += 2) {
			
			firstLetterFromTheText = textForCoding.charAt(i);
			if(firstLetterFromTheText == 'Q') { firstLetterFromTheText = 'Z'; }
			
			secondLetterFromTheText = textForCoding.charAt(i + 1);
			if(secondLetterFromTheText == 'Q') { secondLetterFromTheText = 'Z'; }
			
			if(firstLetterFromTheText == secondLetterFromTheText) { 
				
				if(firstLetterFromTheText == 'A') {
					firstLetterFromTheText = 'E'; 
				} else {
					firstLetterFromTheText = 'A'; 
				}

			}
			
			System.out.print("" + firstLetterFromTheText + secondLetterFromTheText + ", ");
		}
		
	}
	
	public void showTheCodedText() {
		
		int firstLetterX;
		int firstLetterY;
		
		int secondLetterX;
		int secondLetterY;
		
		char firstLetterFromTheText;
		char secondLetterFromTheText;	
		
		System.out.println();
		System.out.println();
		System.out.println("Coded text: ");

		for(int i = 0; i < textForCoding.length() - 1;  i += 2) {
			
			firstLetterFromTheText = textForCoding.charAt(i);
			if(firstLetterFromTheText == 'Q') { firstLetterFromTheText = 'Z'; }
			
			secondLetterFromTheText = textForCoding.charAt(i + 1);
			if(secondLetterFromTheText == 'Q') { secondLetterFromTheText = 'Z'; }
			
			if(firstLetterFromTheText == secondLetterFromTheText) { 
				
				if(firstLetterFromTheText == 'A') {
					firstLetterFromTheText = 'E'; 
				} else {
					firstLetterFromTheText = 'A'; 
				}

			}
			
			firstLetterX = takeEncounteredLetterX(firstLetterFromTheText);
			firstLetterY = takeEncounteredLetterY(firstLetterFromTheText);
			
			secondLetterX = takeEncounteredLetterX(secondLetterFromTheText);
			secondLetterY = takeEncounteredLetterY(secondLetterFromTheText);	
			
			swapTheLetters(firstLetterX, firstLetterY, secondLetterX, secondLetterY, firstLetterFromTheText, secondLetterFromTheText);
		}		
		
	}
	
	public void swapTheLetters(int firstLetterX, int firstLetterY, int secondLetterX, int secondLetterY, 
			char firstLetterFromTheText, char secondLetterFromTheText) {
		
		if(firstLetterX == secondLetterX) {
			
			equalsXcase(firstLetterX, firstLetterY, secondLetterY, firstLetterFromTheText, secondLetterFromTheText);
			
		} 
		
		if(firstLetterY == secondLetterY) {
			
			equalsYcase(firstLetterY, firstLetterX, secondLetterX, firstLetterFromTheText, secondLetterFromTheText);
			
		} 
		
		if((firstLetterX != secondLetterX) && (firstLetterY != secondLetterY)) {
			
			differentCoordinatesCase(firstLetterX, firstLetterY, secondLetterX, secondLetterY);
			
		} 
		
	}
	
	public void equalsXcase(int X, int firstLetterY, int secondLetterY, char firstLetterFromTheText, char secondLetterFromTheText) {
		
		if (firstLetterY < secondLetterY) {
			
			System.out.print("" + secondLetterFromTheText);
			
			secondLetterY += 1;
			
			if(secondLetterY == 5) {
				secondLetterY = 0;
				
			    X++;
			    
			    if(X == 5) { 
			    	X = 0;	
			    }
			    
			}
			
			System.out.print("" + matrix[X][secondLetterY] + ", ");
			
		} else { 
			
			System.out.print("" + firstLetterFromTheText);
			
			firstLetterY += 1;
			
			if(firstLetterY == 5) {
				firstLetterY = 0;
				
		        X++;
			    
			    if(X == 5) { 
			    	X = 0;	
			    }
			    
			}
			
			System.out.print("" + matrix[X][firstLetterY] + ", ");
			
		}
		
	}
	
	public void equalsYcase(int Y, int firstLetterX, int secondLetterX, char firstLetterFromTheText, char secondLetterFromTheText) {
		
		if (firstLetterX < secondLetterX) {
			
			System.out.print("" + secondLetterFromTheText);
			
			secondLetterX += 1;
			
			if(secondLetterX == 5) {
				secondLetterX = 0;
				
			    Y++;
			    
			    if(Y == 5) { 
			    	Y = 0;	
			    }
			    
			}
			
			System.out.print("" + matrix[secondLetterX][Y] + ", ");
			
		} else { 
			
			System.out.print("" + firstLetterFromTheText);
			
			firstLetterX += 1;
			
			if(firstLetterX == 5) {
				firstLetterX = 0;			
				
				Y++;
			    
			    if(Y == 5) { 
			    	Y = 0;	
			    }
			    
			}
			
			System.out.print("" + matrix[firstLetterX][Y] + ", ");
			
		}
		
	}
	
	public void differentCoordinatesCase(int firstLetterX, int firstLetterY, int secondLetterX, int secondLetterY) {
		
		int difference = 0;

    	char firstElement = ' ';
    	char secondElement = ' ';
		
		if (firstLetterY < secondLetterY) 
    	{
			
    		difference = secondLetterY - firstLetterY;
    		firstElement = matrix[firstLetterX][firstLetterY + difference];
			secondElement = matrix[secondLetterX][secondLetterY - difference];
			
		} else {
			
			difference = firstLetterY - secondLetterY;
			firstElement = matrix[firstLetterX][firstLetterY - difference];
			secondElement = matrix[secondLetterX][secondLetterY + difference];
			
		}
		
		System.out.print("" + firstElement + secondElement + ", ");
		
	}
	
	
	public void printMatrix() {
		
		System.out.println();
		
		for (int row = 0; row < matrix.length; row++)
		{
		    for (int col = 0; col < matrix[row].length; col++)
		    {	       
		    	System.out.print(matrix[row][col] + " ");  			    		 	
		    }
		    
		    System.out.println();
		}
		
	}
	
}
