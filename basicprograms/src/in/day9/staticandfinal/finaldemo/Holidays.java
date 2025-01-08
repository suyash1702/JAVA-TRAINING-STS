package in.day9.staticandfinal.finaldemo;

public final class Holidays {
	
	final String festival;
	final int noOfLeaves;

	public Holidays(String festival, int noOfLeaves) {
		this.festival = festival; 
		this.noOfLeaves = noOfLeaves;
	}
	
	public String getFestival() {
		return festival;
	}
	
	public int getNoOfLeaves(final float PI) {
		final int variable = 100;
		return noOfLeaves;
	}
	
	@Override
	public String toString() {
		return "Festival : " + festival + "   No. Of Holidays " + noOfLeaves;
	}
	
} 