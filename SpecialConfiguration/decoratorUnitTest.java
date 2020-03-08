package SpecialConfiguration;

import static org.junit.Assert.*;

import org.junit.Test;

public class decoratorUnitTest {

	@Test
	public void test() {
		SpecX test = new SpecX();
		String output = test.getDescription(xAero);
		assertEquals("Front winglets: These aero adjustments will generate a vortex with the air \n"
				+ "flowing over the front of the car which will increase downforce and therefore \n"
				+ "improve grip at a cost of: ", output);
	}

}
