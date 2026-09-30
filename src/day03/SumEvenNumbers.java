package day03;

import java.util.Scanner;

public class SumEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
		int num = sc.nextInt();
		int sum = 0 ;
		for(int i = 0 ; i<= num ; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
		
	}

}
