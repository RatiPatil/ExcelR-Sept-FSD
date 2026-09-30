package day03;

import java.util.Scanner;

public class PrintNumbersToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number Till that you want to print : ");
		
		int num = input.nextInt();
		
		
		for(int i = 1 ; i<=num ; i++) {
			System.out.println(i);
		}
	}

}
