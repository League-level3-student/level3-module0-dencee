package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		Calculator c = new Calculator();
		assertEquals( c.sum(2,3), 5);
		assertEquals( c.sum(-99, -1), -100 );
		assertEquals( c.sum(-1,  5), 4 );
	}
	
	@Test
	void testSubtraction() {
		Calculator c = new Calculator();
		assertEquals( c.subtract(5,1), 4);
		assertEquals( c.subtract(-4,-4), 0);
		assertEquals( c.subtract(2, -4), 6);
		assertEquals( c.subtract(2,4), -2);
	}
	
	@Test
	void testFloat() {
		Calculator c = new Calculator();
		assertEquals( c.sumFloat(1.1f,  1.1f), 2.2, 0.1);
	}

}
