package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest1 {

	@Test
	void test() {
		String actual= "Y";
		String expected = "Y";

		assertEquals(expected, actual);
		System.out.println("Suite Test 2 is successful " + actual);
	}

}
