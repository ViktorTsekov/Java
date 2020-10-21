package uk.ac.reading.gy001040.Week1;

import javax.swing.JOptionPane;

public class CountS {
	
	static int count(String arg) {
		int n = 0;
		
		for(int i = 0; i < arg.length(); i++) {
			if(arg.charAt(i) == 's' || arg.charAt(i) == 'S') {
				n++;
			}
		}
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString = JOptionPane.showInputDialog(null, "Enter a string");
		JOptionPane.showMessageDialog(null, "Your string contains " + count(aString) + " Ss");
	}

}
