
	
	package in.day8.logicalprograms.reversestring;

	public class ReverseStringLine {
		
		String variable;
		
		public ReverseStringLine() {}
		
		public ReverseStringLine(String variable) {
			this.variable=variable;
		}

		public String getVariable() {
			return variable;
		}

		public void setVariable(String variable) {
			this.variable = variable;
		}
		
		public String reverseStringLine() {
			String[] stringArray = variable.split(" ");
			int left = 0;
			int right = stringArray.length-1;
			while(left<=right) {
				String  temp = stringArray[left];
				stringArray[left] = stringArray[right];
				stringArray[right]=temp;
				left++;
				right--;
			}
			
			String result = String.join(" " ,stringArray);
			return result;
			
			
		}			
	}
	



