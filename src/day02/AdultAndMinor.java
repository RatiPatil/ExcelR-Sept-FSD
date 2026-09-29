package day02;

import java.util.Scanner;

public class AdultAndMinor {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a age : ");
		
		int age = sc.nextInt();
		
		
		if(age>=18) {
			System.out.println("Adult");
		}else {
			System.out.println("Minor");
		}
		
		System.out.println("Thank You !");
		
		
		
		
	}

}
