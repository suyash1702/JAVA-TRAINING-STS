package in.day10.staticandfinal.counter;

public class ObjectCounter {
	static int i;
	
	public ObjectCounter() {
		i++;
	}
	
	public void printCount(){
		System.out.println("Count is :"+ i);
	}
	
	

}
