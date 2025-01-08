package in.day7.logicalprogram.number.prime.main;

import in.day7.logicalprogram.number.prime.PrimeNumber;

public class MainPrimeNumber {
	
	public static void main(String[] args) {
		PrimeNumber number = new PrimeNumber();
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a integer number :");
//		int variable = scanner.nextInt();
		
		for(int i =2;i<=100;i++){
			
				number.setNumber(i);
				if(number.isPrime(i)) {
					System.out.println(i);
				}
//							System.out.println(i + " is not a prime number");
		}	
		
	}

}
