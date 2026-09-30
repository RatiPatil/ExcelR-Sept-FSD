package day03;

import java.util.Scanner;

public class PerfectNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter a number ");
		int number = sc.nextInt();
		int sum = 0 ;
		
		int temp = number; 
		
		for(int i = 1 ; i<number ; i++) {
			
			if(number%i==0) {
				sum+=i;
			}
			
		}
		
		if(temp==sum) {
			System.out.println("Perfect Number and Sum is :" +" " + sum);
		}else {
			System.out.println("Not Perfect Number and Sum is : " + " " + sum);
		}

	}

}
