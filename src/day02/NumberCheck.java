package day02;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number You want check Negetive Or Positive : " );
		int number = sc.nextInt();
		
		if(number < 0 ) {
			System.out.println("The number is Negetive ");
		}else {
			System.out.println("This is the Positive Number ");
		}
		

	}

}
