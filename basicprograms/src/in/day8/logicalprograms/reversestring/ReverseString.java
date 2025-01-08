package in.day8.logicalprograms.reversestring;

public class ReverseString {
	
	String variable;
	
	public ReverseString() {}
	
	public ReverseString(String variable) {
		this.variable=variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public String reverseString() {
		char[] charArray = variable.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left<=right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		return new String(charArray);
		
	}
}
