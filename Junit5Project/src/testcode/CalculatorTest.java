package testcode;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import businesscode.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	//Create a object of a class to be Tested
	private Calculator calc;
	/*@Before annotation in JUnit is used on a method containing Java code to run before each test case. i.e it runs before each test execution.*/
	@Before
	public void setUp() throws Exception {
		calc=new Calculator();
	}
	/*@After annotation is used on a method containing java code to run after each test case. These methods will run even if any exceptions are thrown in the test case or in the case of assertion failures.*/

	@After
	public void tearDown() throws Exception {
		calc=null;
	}

	@Test
	public void testAdd() {
		assumeTrue(5>10);
		double result=calc.add(10.50,10.32);
		assertEquals(20.82,result,0);
	}

	@Test
	public void testSubtract() {
		assumeFalse(5<1);
		double result=calc.subtract(100.5,95);
		assertEquals(5.5,result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(100,2.5);
		assertEquals(250,result,0);
	}

	@Test
	public void testDivide() {
		double result=calc.divide(100,10);
		assertEquals(10,result,0);
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		calc.divide(100, 0);
	}


}
