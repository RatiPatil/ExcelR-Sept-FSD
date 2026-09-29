package day02;

import java.util.Scanner;

public class TemperatureCheck {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int temp = Integer.parseInt(sc.nextLine());
		
		if(temp<10) {
			System.out.println("Very Cold");
		}else if(temp>=10 && temp <=20) {
			System.out.println("Cold");
		}else if(temp>20 && temp <=30) {
			System.out.println("Normal");
		}else {
			System.out.println("Hot");
		}
	}

}
