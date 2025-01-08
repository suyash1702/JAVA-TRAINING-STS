package in.day8.logicalprograms.charactercounting;

public class CharacterCounting {

	    private String variable;
	    
	    // Add setter method
	    public void setVariable(String variable) {
	        this.variable = variable;
	    }
	
	    public void countnVowels() {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int consonant = 0;
		
		
		for(int j=o;j<variable.length();j++) 
		{
			switch (variable.charAt(j)) {
			case 'a' -> a++;
			case 'e' -> e++;
			case 'i' -> i++;
			case 'o' -> o++;
			case 'u' -> u++;
			default -> consonant++;
			
		}
		
		
	}
		
		System.out.println("a :" + a);
		System.out.println("e :" + e);
		System.out.println("i :" + i);
		System.out.println("o :" + o);
		System.out.println("u :" + u);

	}
}
