package in.day9.staticandfinal.finaldemo.main;

import in.day9.staticandfinal.finaldemo.Holidays;

public class MainHolidays {
	
	public static void main(String[] args) {
		
		Holidays diwali = new Holidays("Diwali",5);
		Holidays dusshehra = new Holidays("Dusshehra",5);
		
		System.out.println(diwali);
		System.out.println(dusshehra);
	}

}
