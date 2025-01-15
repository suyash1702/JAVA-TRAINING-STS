package in.day12.accessmodifier.testaccessmodifiers.main;

import in.day12.accessmodifier.testaccessmodifiers.ProtectedDemo;

public class MainProtectedDemo extends ProtectedDemo{
	
	public static void main(String[] args) {
	MainProtectedDemo demo = new MainProtectedDemo();
	
//		demo.msg = "Hello";
		demo.printProtectedDemoMessage();
	}

}
