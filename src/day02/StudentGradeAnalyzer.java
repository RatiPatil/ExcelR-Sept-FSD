package day02;

import java.util.Scanner;

public class StudentGradeAnalyzer{
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter a Marks To check Gread :");
		int marks = sc.nextInt();
		
		if(marks >100|| marks < 0 ) {
			System.out.println("Invalid Number");
		}else if(marks >=90) {
			System.out.println("A");
		}else if(marks >=70) {
			System.out.println("B");
			
		}else if(marks >=60) {
			System.out.println("C");
		}else if(marks>=50) {
			System.out.println("D");
		}else {
			System.out.println("Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}