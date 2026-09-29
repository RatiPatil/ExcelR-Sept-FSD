package day02;

import java.util.Scanner;

public class StringInputUsingScanner {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name ");
		
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		
		
	}

}
