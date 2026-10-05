package day04;

public class PrimeNumberInArray {
	public static void main(String [] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,9,};
		
		
		for(int i = 0 ; i<arr.length; i++) {
			boolean isPrime = true;
			int num = arr[i];
		
			
			if(num<=1) {
				isPrime = ;
				
			}else {
				for(int j = 2 ; j<num;j++) {
					if(num%j==0) {
						isPrime = false ; 
						break;
					}
				}
			}
			if(isPrime) {
				System.out.println("prime number"+num);
			}else {
				System.out.println("not prime number"+num);
			}
		}
		
		
		
		
	}

}
