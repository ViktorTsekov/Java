package uk.ac.reading.gy001040.Week1;

import javax.swing.JOptionPane;

public class Initials {

	static String returnInitials(String name) {
		char curCharacter;
		String initials = "";
		
		for(int i = 0; i < name.length(); i++) {
			curCharacter = name.charAt(i);
			
			if(Character.isUpperCase(curCharacter)) {
				initials += curCharacter;
			}
			
		}
		
		return initials;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog(null, "Enter your name");
		JOptionPane.showMessageDialog(null, "Your initials are: " + returnInitials(name));
	}

}
