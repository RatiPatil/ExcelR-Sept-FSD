package day03;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number You Want to check : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num <=0) {
			isPrime = false;
			
		}else {
			for(int i = 2 ; i<num; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		

		
		if(isPrime) {
			System.out.println("PrimeNumber");
		}else {
			System.out.println("NotPrimeNumber");
		}
		
		
	}

}
