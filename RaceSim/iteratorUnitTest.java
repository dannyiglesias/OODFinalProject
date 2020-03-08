package RaceSim;

import static org.junit.Assert.*;

import org.junit.Test;

public class iteratorUnitTest {

	@Test
	public void test() {
		ConfigurationItem test = new ConfigurationItem();
		String output = test.name(engine);
		assertEquals(engine, output);
	}

}
