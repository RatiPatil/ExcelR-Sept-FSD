package day02;

import java.util.Scanner;

public class NestedIfElse02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Salary : ");

		double salary = sc.nextDouble();

		if (salary >= 50000) {

			if (salary >= 100000) {
				System.out.println("High Salary");
			} else {
				System.out.println("Good Salary");
			}

		} else {

			if (salary >= 25000) {
				System.out.println("Average Salary");
			} else {
				System.out.println("Low Salary");
			}
		}

		sc.close();
	}
}