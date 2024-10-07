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
		assertEquals("0+1 = 1", 1, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}
	
	@Test
	public void testAddition(){
		Calculator sut = new Calculator();
		sut.setState(50);
		sut.add(1034);
		assertEquals(1084,sut.getState());
	}

	@Test
	public void testMultiplication(){
		Calculator sut = new Calculator();
		sut.setState(31);
		sut.mult(1762);
		assertEquals(54622,sut.getState());
	}

	@Test
	public void testSubstraction(){
		Calculator sut = new Calculator();
		sut.setState(1987);
		sut.substract(168872);
		assertEquals(-166885,sut.getState());
	}

	@Test
	public void testDivision(){
		Calculator sut = new Calculator();
		sut.setState(1100);
		sut.divide(100);
		assertEquals(11,sut.getState());
		sut.setState(10);
		sut.divide(0);
		assertEquals(10,sut.getState());
	}
}
