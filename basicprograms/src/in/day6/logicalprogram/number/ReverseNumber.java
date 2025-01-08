package in.day6.logicalprogram.number;

public class ReverseNumber {
	
	int number;
	
	public ReverseNumber() {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int reverseNumber() {
		int result = 0;
		int temp = number;
		while(temp!=0) {
			
			result = result *10 + temp % 10;		

			temp = temp/10;
		}
		return result;
	}
	
	public boolean checkForPalindromeNumber() {
		return reverseNumber() == number;
		
	}

}
