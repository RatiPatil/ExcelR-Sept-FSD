package day02;

import java.util.Scanner;

public class ElectricityUsage {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Electricity Usage : ");
		int electricityusage = sc.nextInt();
		
		
		if(electricityusage > 0 && electricityusage <= 100) {
			System.out.println("low usage");
		}else if(electricityusage > 101 && electricityusage <= 300) {
			System.out.println("Medium usage");
		}else if(electricityusage > 300) {
			System.out.println("High usage");
		}else {
			System.out.println("Invlid Units");
		}
		
		
	}

}
