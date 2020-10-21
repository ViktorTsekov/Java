package uk.ac.reading.gy001040.Week2;

public class MultiplicationTable {

	private int maxNum;
	private int[][] table;
	
	MultiplicationTable(int num) {
		maxNum = num;
		table = new int[num][num];
	}
	
	public void populateTable() {
		for(int i = 0; i < maxNum; i++) {
			for(int j = 0; j < maxNum; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}
	}
	
	public void print() {
		for(int i = 0; i < maxNum; i++) {
			for(int j = 0; j < maxNum; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for(int i = 0; i < maxNum; i++) {
			for(int j = 0; j < maxNum; j++) {
				str += table[i][j] + "\t";
			}
			str += "\n";
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable mt = new MultiplicationTable(10);
		mt.populateTable();
		System.out.println(mt);
	}

}
