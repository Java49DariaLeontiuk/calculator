package telran.numbers.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static telran.numbers.Calculator.*;

class CalculatorTest {

	@Test
	void testMultiply() {
		assertEquals(4, multiply(2, 2));
		assertEquals(-4, multiply(2, -2));
		assertEquals(4, multiply(-2, -2));
	}

	@Test
	void testSum() {
		assertTrue(sum(2,2) > 0);
		assertFalse(sum(2,-10) >= 0);
		assertEquals(4, sum(3, 1));
		assertEquals(2, sum(3, -1));
	}

	@Test
	void testSubtract() {
		assertEquals(4, subtract(5, 1));
		assertEquals(-2, subtract(2, 4));
		assertEquals(-4, subtract(-3, 1));
		
	}

	@Test
	void testDivine() {
		assertEquals(0, divine(0, 10));
		assertEquals(1, divine(4, 3));
		assertEquals(0, divine(3, 4));
	}
	@Test
	@Disabled 
	void testDivideZero() {
		assertEquals(0, divine(10, 0));
	}

	@Test
	void testRemainder() {
		assertEquals(3, remainder(3, 4));
		assertEquals(0, remainder(12, 3));
	}

}
