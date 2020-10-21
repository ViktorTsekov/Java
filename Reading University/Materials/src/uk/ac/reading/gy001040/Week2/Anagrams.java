package uk.ac.reading.gy001040.Week2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagrams {
	
	private List<String> strings;
	
	public List<String> getStrings() {
		return strings;
	}

	public void setStrings(String input) {
		this.strings = Arrays.stream(input.toLowerCase().split(" "))
						.collect(Collectors.toList());
	}
	
	boolean areSameLenght(String par1, String par2) {
		return(par1.length() == par2.length());
	}
	
	boolean areAnagrams(String par1, String par2) {
		StringBuilder sb = new StringBuilder(par2);
		
		if(areSameLenght(par1, par2)) {
			
			for(int i = 0; i < par1.length(); i++) {
				char curChar = par1.charAt(i);
				
				for (int j = 0; j < sb.toString().length(); j++) {
					if(sb.toString().charAt(j) == curChar) {
						sb.deleteCharAt(j);
					}
				}
				
			}
			
		}
		
		return(sb.toString().isEmpty());
	}
	
	void printMessage(String par1, String par2) {
		
		if(areAnagrams(par1, par2)) {
			System.out.println(par1 + " and " + par2 + " are anagrams");
		} 
		
	}
	
	public void checkStatement() {
		for (int i = 0; i < strings.size(); i++) {
			for (int j = i + 1; j < strings.size(); j++) {
				printMessage(strings.get(i), strings.get(j));
			}
		}
	}
	
}
