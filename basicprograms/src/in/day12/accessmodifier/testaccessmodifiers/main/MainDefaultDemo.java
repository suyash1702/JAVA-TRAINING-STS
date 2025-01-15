package in.day12.accessmodifier.testaccessmodifiers.main;

import in.day12.accessmodifier.testaccessmodifiers.Helper;

public class MainDefaultDemo {
	
	public static void main(String[] args) {
		
//		DefaultDemo1 demo1 = new DefaultDemo1();
//		DefaultDemo2 demo2 = new DefaultDemo2();
//		
//		demo1.printDefaultDemo1Message();
		
		Helper helper = new Helper();
		helper.assessPrintDefaultDemo1Message();
		helper.accessPrintDefaultDemo2Message();
		
	}

}
