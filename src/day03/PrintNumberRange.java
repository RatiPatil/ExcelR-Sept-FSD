package day03;

import java.util.Scanner;

public class PrintNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Strating Point Number : ");
		int start = input.nextInt();
		System.out.print("Enter a Ending Point Number : ");
		int End = input.nextInt();
		
		
		for(int i = start ; i<=End; i++) {
			System.out.println(i);
		}

		
	}

}
