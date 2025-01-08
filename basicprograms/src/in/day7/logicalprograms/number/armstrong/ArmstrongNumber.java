package in.day7.logicalprograms.number.armstrong;

public class ArmstrongNumber {
	
	int number;
	
	public ArmstrongNumber() {}
	
	public ArmstrongNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int setNumber(int number) {
		return number;
	}
	
	public int noOfDigit() {
		int temp = number;
		int count = 0;
		while(temp!=0) {
			temp/=10;
			count ++;
		}
		
		return count;
	}
	
	public int calculatePower(int digit,int count) {
		int power = 1;
		for(int i = 0;i <= count; i++) 
		{
			power*= digit;
			
		}
		
		return power;
		
	}
	
	public boolean isArmstrongNumber() {
		int count = noOfDigit();
		int temp = number;
		int armstrong = 0;
		
		while(temp!=0) {
			armstrong += calculatePower(temp%10, count);
			temp/=10;
		}
		
		return number == armstrong;
	}
	
}
