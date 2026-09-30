
package day03;

import java.util.Scanner;

public class DoWhilePractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter num2:");
        int num2 = sc.nextInt();

        int choice = 0;

        do {

            double result = 0.0;

            System.out.println("\n1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Division");
            System.out.println("4 : Multiplication");
            System.out.println("5 : Remainder");
            System.out.println("0 : Exit");

            System.out.println("Enter a Choice:");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

                case 4:
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 5:
                    result = num1 % num2;
                    System.out.println("Result = " + result);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
