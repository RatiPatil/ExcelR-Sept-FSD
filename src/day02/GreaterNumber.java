package day02;

import java.util.Scanner;

public class GreaterNumber {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a n1 ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter a n2");
		
		int n2 = sc.nextInt();
		
		
		if(n1 > n2) {
			System.out.println("The Gater Number is : " + n1);
		}else {
			System.out.println("The Greater Number is : " + n2);
		}
		
		
	}

}
