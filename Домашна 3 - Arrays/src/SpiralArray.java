import java.util.Scanner;
public class SpiralArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns : ");
		int n = input.nextInt();
		int matrix[][] = new int[n][n];
		int position = 1;
		int startRow = 0;
		int endRow = n - 1;
		int startCol = 0;
		int endCol = n - 1;
		while (position <= n * n) {
			for (int col = startRow; col <= endRow; col++) {
				matrix[startCol][col] = position++;
			}
			startCol++;
			for (int row = startCol; row <= endCol; row++) {
				matrix[row][endRow] = position++;
			}
			endRow--;

			for (int col = endRow; col >= startRow; col--) {
				matrix[endCol][col] = position++;
			}
			endCol--;

			for (int row = endCol; row >= startCol; row--) {
				matrix[row][startRow] = position++;
			}
			startRow++;
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {

				System.out.printf("%-5d", matrix[row][col]);
			}
			System.out.print("\n");
		}
		input.close();
	}
	}


