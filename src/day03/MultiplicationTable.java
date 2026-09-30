package day03;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number You Want to print Table :  ");
		int number= input.nextInt();
		
		
		for(int i = 1 ; i<=10 ; i++) {
			System.out.println(number + " X " + i + " = " + number*i);
		}
		
		

	}

}
