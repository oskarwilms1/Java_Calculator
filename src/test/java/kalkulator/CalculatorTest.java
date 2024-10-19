package kalkulator;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals(1, sut.getState(),0.0001);
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState(),0.0001);
	}
	
	@Test
	public void testPositiveAddition(){
		Calculator sut = new Calculator();
		sut.setState(Double.MAX_VALUE);
		sut.add(Double.MAX_VALUE);
		assertEquals(Double.POSITIVE_INFINITY,sut.getState(),0.0001);
	}
	@Test
	public void testNegativeAddition(){
		Calculator sut = new Calculator();
		sut.setState(-Double.MAX_VALUE);
		sut.add(-Double.MAX_VALUE);
		assertEquals(Double.NEGATIVE_INFINITY,sut.getState(),0.0001);
	}

	@Test
	public void testPositiveMultiplication(){
		Calculator sut = new Calculator();
		sut.setState(Double.MAX_VALUE);
		sut.mult(Double.MAX_VALUE);
		assertEquals(Double.POSITIVE_INFINITY,sut.getState(),0.0001);
	}
	@Test
	public void testNegativeMultiplication(){
		Calculator sut = new Calculator();
		sut.setState(-Double.MAX_VALUE);
		sut.mult(Double.MAX_VALUE);
		assertEquals(Double.NEGATIVE_INFINITY,sut.getState(),0.0001);
	}

	@Test
	public void testSubstraction(){
		Calculator sut = new Calculator();
		sut.setState(1987);
		sut.substract(168872);
		assertEquals(-166885,sut.getState(),0.0001);
	}

	@Test
	public void testDivision(){
		Calculator sut = new Calculator();
		sut.setState(1100);
		sut.divide(100);
		assertEquals(11,sut.getState(),0.0001);
		sut.setState(10);
		sut.divide(0);
		assertEquals(10,sut.getState(),0.0001);
	}
}
