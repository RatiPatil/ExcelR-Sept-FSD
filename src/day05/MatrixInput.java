package day05;

import java.util.Scanner;

public class MatrixInput {
	public static void main(String [] args) {
		
		int matrix[][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 9 integers for the 3x3 matrix:");
		// Input Loop
		for(int i = 0 ; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[i].length; j++) { // Best practice: matrix[i].length for columns
				matrix[i][j] = sc.nextInt();
			}
		}
		
		sc.close(); // Clean up resource leak
		
		System.out.println("\nThe Matrix Is:");
		// Output Loop (using standard format)
		for(int m = 0 ; m < matrix.length; m++) {
			for(int n = 0 ; n < matrix[m].length; n++) {
				System.out.print(matrix[m][n] + "\t"); // Prints items in the same row separated by tabs
			}
			System.out.println(); // Moves to the next row line
		}
	}
}
