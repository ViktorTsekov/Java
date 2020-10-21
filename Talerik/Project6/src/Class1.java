import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[3][4];
		int[] array = new int[12];
		int s;
		int n = 0, m = 0, j = 0;
		for (int i = 0; i < 12; i++) {
			System.out.print("Enter the mark of the film: ");
			s = input.nextInt();
			if (m == 3) {
				m = 0;
				n++;
			}
			matrix[m][n] = s;
			m++;
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				array[j] = matrix[row][col];
				j++;
			}
		}
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
