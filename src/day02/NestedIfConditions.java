package day02;

import java.util.Scanner;

public class NestedIfConditions {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter Your Percentage : ");
		
		double percentage = sc.nextDouble();
		
		if(percentage>=75) {
			System.out.println("DIST");
		}else if(percentage>=60) {
			System.out.println("First Class");
		}else if(percentage>=50) {
			System.out.println("Second Class");
		}else if(percentage >=40) {
			System.out.println("Third Class");
		}else if(percentage < 40) {
			System.out.println("Not Pass");
		}else {
			System.out.println("Enter a valid number !");
		}
		
	}

}
