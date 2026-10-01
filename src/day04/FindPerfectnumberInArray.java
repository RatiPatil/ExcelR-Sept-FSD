package day04;
import java.util.Scanner;
public class FindPerfectnumberInArray {
	

	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[5];

	        System.out.println("Enter 5 elements:");

	        for (int i = 0; i < 5; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Perfect numbers are:");

	        for (int i = 0; i < 5; i++) {

	            int num = arr[i];
	            int sum = 0;

	            for (int j = 1; j < num; j++) {

	                if (num % j == 0) {
	                    sum = sum + j;
	                }
	            }

	            if (sum == num) {
	                System.out.println(num);
	            }
	        }

	        sc.close();
	    }
	}

