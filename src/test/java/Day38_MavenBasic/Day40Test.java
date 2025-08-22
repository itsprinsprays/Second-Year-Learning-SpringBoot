package Day38_MavenBasic;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Day40_MavenBasic.Calculator;

class Day40Test {
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(5, calc.add(2, 3));
	}
	
	
	@Test
	public void testMinus() {
		assertEquals(2, calc.subtract(4, 2));
	}

}
