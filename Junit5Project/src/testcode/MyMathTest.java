package testcode;

import static org.junit.Assert.*;
import businesscode.MyMath;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	private MyMath m;

	@Before
	public void setUp() throws Exception {
		m=new MyMath();
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testSum() {
		System.out.println("Test 1");
		assertEquals(10,m.sum(new int[] {5,3,2}));
		
	}
	@Test
	public void testSum2() {
		System.out.println("Test 2");
		assertEquals(101,m.sum(new int[] {55,10,20,6,10}));
		
	}
		
	}


