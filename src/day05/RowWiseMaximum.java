package day05;

import java.util.Scanner;

public class RowWiseMaximum {
	
	public static void main(String [] args) {
		
		int matrix [][] = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<=matrix.length-1; i++) {
			for(int j = 0 ; j<=matrix.length-1; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		for(int m = 0 ; m <=matrix.length-1; m++) {
			int max = Integer.MIN_VALUE;
			for(int n = 0 ; n<=matrix[m].length-1; n++) {
				
				if(matrix[m][n] > max) {
					
					max = matrix[m][n];
					
				}
			}
			
			
			System.out.println("Maximum element in Row " + (m + 1) + " is: " + max);
		}
		}
		

		
		
		
	}


