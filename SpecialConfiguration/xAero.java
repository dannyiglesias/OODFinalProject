package SpecialConfiguration;


public class xAero extends SpecX {
	public xAero() {
		description = "Front winglets: These aero adjustments will generate a vortex with the air \n"
				+ "flowing over the front of the car which will increase downforce and therefore \n"
				+ "improve grip at a cost of: ";
	}
	
	public double cost() {
		return 15000;
	}
	

}
