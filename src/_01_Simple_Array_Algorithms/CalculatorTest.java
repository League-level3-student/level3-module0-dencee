package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator c = new Calculator();
		assertEquals( c.sum(2,5), 8);
	}

	@Test
	void testSubtract() {
		//fail("Not yet implemented");
	}

	@Test
	void testSumFloat() {
		//fail("Not yet implemented");
	}

}
