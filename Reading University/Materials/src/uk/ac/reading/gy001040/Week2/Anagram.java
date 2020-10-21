package uk.ac.reading.gy001040.Week2;

public class Anagram {
	
	private String firstWord;
	private String secondWord;
	
	public String getFirstWord() {
		return firstWord;
	}

	public void setFirstWord(String str) {
		this.firstWord = modifyWord(str);
	}

	public String getSecondWord() {
		return secondWord;
	}

	public void setSecondWord(String str) {
		this.secondWord = modifyWord(str);
	}
	
	public String modifyWord(String str) {
		return str.toLowerCase().replaceAll("\\s+", "");
	}
	
	public boolean areSameLenght() {
		return firstWord.length() == secondWord.length();
	}
	
	public boolean areAnagrams() {

		if(areSameLenght()) {
			
			for(int i = 0; i < firstWord.length(); i++) {
				Character curChar = firstWord.charAt(i);
	
				if(!secondWord.contains(curChar.toString())) {
					return false;
				}
				
			}
			
		} else {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Anagram an = new Anagram();
		
		an.setFirstWord("Dog");
		an.setSecondWord("God");
		
		if(an.areAnagrams()) {
			System.out.println(an.getFirstWord() + " and " + an.getSecondWord() + " are anagrams");
		} else {
			System.out.println(an.getFirstWord() + " and " + an.getSecondWord() + " are not anagrams");
		}
		
	}
	
}
