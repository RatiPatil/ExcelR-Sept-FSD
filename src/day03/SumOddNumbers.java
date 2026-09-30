package day03;

import java.util.Scanner;

public class SumOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		
		int sum=0;
		
		for(int i = 0 ; i<=number;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
	}

}
