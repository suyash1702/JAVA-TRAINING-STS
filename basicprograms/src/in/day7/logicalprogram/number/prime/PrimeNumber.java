package in.day7.logicalprogram.number.prime;

public class PrimeNumber {
	
	int number;
	
	public PrimeNumber() {}
	
	public PrimeNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime(int number) {
		for(int i =2;i*i<number;i++) {
			if(number%i == 0) {
				return false;
			}
				
		}
			
		return true;	
	}
	
}
