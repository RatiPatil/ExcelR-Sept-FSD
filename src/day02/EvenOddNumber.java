package day02;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter A Number You want to check Even or Odd ");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number ");
		}
	}

}
