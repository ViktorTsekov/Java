package uk.ac.reading.gy001040.Week2;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class SmallestDifference {

	public static void main(String[] args) {
		int index = 0;
		int minVal = 1000;
		var str = "1 4 6 2 8 9 13";
		var numbers = Arrays.stream(str.split(" "))
						.map(x->Integer.parseInt(x))
						//.sorted((x,y)->x.compareTo(y))
						.distinct()
						.collect(Collectors.toList());
		
		for(int i = 0; i < numbers.size() - 1; i++) {
			int curVal = Math.abs(numbers.get(i) - numbers.get(i + 1));
			index = (curVal < minVal) ? i : index;
			minVal = (curVal < minVal) ? curVal : minVal;
		}
		
		JOptionPane.showMessageDialog(null, "Smallest difference is " + minVal + " at index " + index);
	}

}
