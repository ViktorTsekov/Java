import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text for coding: ");
		String s = input.nextLine(), Cs;
		char element;
		char[][] matrix = new char[5][5];
		char[] taken = new char[100];
		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int i = 0, j, k, flag = 0;
		int n = 0, m = 0, br = 0, razlika;
		int LastRow = 0, LastCol = 0;
		Cs = s.toUpperCase();
		Cs = Cs.replaceAll("\\s", "");

		for (j = 0; j < Cs.length(); j++) {
			element = Cs.charAt(j);
			for (k = 0; k < taken.length; k++) {
				if (taken[k] == element)
					flag = 1;
			}
			if (flag == 0) {
				br++;
				taken[i] = element;
				for (int row = n; row < n + 1; row++) {
					for (int col = m; col < m + 1; col++) {
						matrix[row][col] = element;
					}
				}
				m++;
				if (m == 5) {
					m = 0;
					n++;
				}
				LastRow = n;
				LastCol = m;
			}
			if (flag == 1) {
				flag = 0;
			}
			i++;
		}

		char Letter;
		int q1;
		razlika = 25 - br;
		n = LastRow;
		m = LastCol;
		i = 0;
		for (int q = 0; q < razlika; q++) {
			q1 = 0;
			Letter = alphabet[i];
			i++;
			while (q1 != br) {
				if (Letter == taken[q1]) {
					Letter = alphabet[i];
					i++;
					q1 = 0;
				}
				q1++;
			}

			for (int row = n; row < n + 1; row++) {
				for (int col = m; col < m + 1; col++) {
					matrix[row][col] = Letter;
				}
			}
			m++;
			if (m == 5) {
				m = 0;
				n++;
			}
		}

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

		System.out.print("Enter key: ");
		String key = input.nextLine();
		char el1;
		char el2;
		int X1 = 0, Y1 = 0;
		int X2 = 0, Y2 = 0;
		int pr1 = 0, pr2 = 0;
		int maxX, maxY;
		int length;
		key = key.toUpperCase();
		key = key.replaceAll("\\s", "");
		length = key.length();
		if (length % 2 == 0) {
			length += 1;
		}
		i = 0;
		j = 1;
		while (j != length) {
			el1 = key.charAt(i);
			el2 = key.charAt(j);
			if (el1 == el2) {
				key = new StringBuilder(key).insert(j, "X").toString();
			}
			i += 2;
			j += 2;
		}
		length = key.length();
		if (length % 2 == 0) {
			length += 1;
		}
		i = 0;
		j = 1;
		while (j != length) {
			el1 = key.charAt(i);
			el2 = key.charAt(j);
			System.out.print(el1 + " " + el2 + ", ");
			i += 2;
			j += 2;
		}
		i = 0;
		j = 1;
		System.out.println();
		while (j != length) {
			el1 = key.charAt(i);
			el2 = key.charAt(j);
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					if (matrix[row][col] == el1) {
						X1 = row;
						Y1 = col;
						pr1 = 1;
					}
					if (matrix[row][col] == el2) {
						X2 = row;
						Y2 = col;
						pr2 = 1;
					}
				}
			}
			if (pr1 == 1 && pr2 == 1) {
				if (Y1 == Y2) {
					if (X1 < X2) {
						maxX = X2;
						System.out.print(el2 + " ");
						maxX += 1;
						if (maxX == 5) {
							maxX = 0;
						}
						System.out.print(matrix[maxX][Y1] + ", ");
					}
					if (X1 > X2) {
						maxX = X1;
						System.out.print(el1 + " ");
						maxX += 1;
						if (maxX == 5) {
							maxX = 0;
						}
						System.out.print(matrix[maxX][Y2] + ", ");
					}

				}
				if (X1 == X2) {
					if (Y1 < Y2) {
						maxY = Y2;
						System.out.print(el2 + " ");
						maxY += 1;
						if (maxY == 5) {
							maxY = 0;
						}
						System.out.print(matrix[X1][maxY] + ", ");
					}
					if (Y1 > Y2) {
						maxY = Y1;
						System.out.print(el1 + " ");
						maxY += 1;
						if (maxY == 5) {
							maxY = 0;
						}
						System.out.print(matrix[X2][maxY] + ", ");
					}
				}
				if (X1 != X2 && Y1 != Y2) {
					if (X1 < X2) {
						razlika = X2 - X1;
						el1 = matrix[X1 + razlika][Y1];
						el2 = matrix[X2 - razlika][Y2];
					}
					if (X1 > X2) {
						razlika = X1 - X2;
						el1 = matrix[X1 - razlika][Y1];
						el2 = matrix[X2 + razlika][Y2];
					}
					System.out.print(el1 + " " + el2 + ", ");
				}
			}
			if (pr1 != 1 || pr2 != 1) {
				System.out.print("   , ");
			}
			i += 2;
			j += 2;
			pr1 = 0;
			pr2 = 0;
		}

	}

}