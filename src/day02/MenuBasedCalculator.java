package day02;

import java.util.Scanner;

public class MenuBasedCalculator {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a Number What You want to perform a task : ");
		
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");

		System.out.println("5. Reminder");
		
		

		
		int choice = sc.nextInt();
		
		switch(choice) {
		case  1 :
			System.out.println("====================================================================");
			System.out.println("Enter a n1");
			int n1 = sc.nextInt();
			System.out.println("Enter a n2");
			int n2 = sc.nextInt();
			
			int sum = n1+n2;
			
			System.out.println(sum);
			
			break;
		case 2 :
			System.out.println("====================================================================");
			System.out.println("Enter a num1");
			int num1 = sc.nextInt();
			System.out.println("Enter a num2");
			int num2 = sc.nextInt();
			
			int sub = num1-num2;
			
			System.out.println(sub);
			break;
			
		case 3 :
			
			System.out.println("====================================================================");
			System.out.println("Enter a num1");
			int number1 = sc.nextInt();
			System.out.println("Enter a num2");
			int number2 = sc.nextInt();
			try {
				int div = number1/number2;
				
				System.out.println(div);
		
			} catch (ArithmeticException e){
				System.out.println("Cannot divide by zero");
				
			}
			
			break ;
			
		case 4:
			System.out.println("====================================================================");
			System.out.println("Enter a num1");
			int number01 = sc.nextInt();
			System.out.println("Enter a num2");
			int number02 = sc.nextInt();
			
			int mul = number01*number02;
			
			System.out.println(mul);
			break;
			
			
			
			
		case 5:
			
			
			System.out.println("====================================================================");
			System.out.println("Enter a num1");
			int numbers1 = sc.nextInt();
			System.out.println("Enter a num2");
			int numbers2 = sc.nextInt();
			
			if (numbers2 == 0) {
			    System.out.println("Cannot perform modulus by zero");
			} else {
			    int rem = numbers1 % numbers2;
			    System.out.println("Result: " + rem);
			}
			break;
			
		
		default :
			System.out.println("Choose Valid Number !");
		
		
		
		
		}
		
		
		
	}

}
