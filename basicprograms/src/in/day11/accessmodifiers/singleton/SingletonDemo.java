package in.day11.accessmodifiers.singleton;

public class SingletonDemo
{
	private static SingletonDemo object1;
	
	private SingletonDemo() {
		
	}
	
	static{
		object1 = new SingletonDemo();
	}
	
	public static SingletonDemo getObject() {
		return object1;
	}
}
