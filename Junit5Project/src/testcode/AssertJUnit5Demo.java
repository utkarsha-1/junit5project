package testcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertJUnit5Demo {

	@Test
	void testAssertEqual() {
	assertEquals("ABC", "ABC");
	assertEquals(20, 20, "optional assertion message");
	assertEquals(2 + 2, 4);
	}



	@Test
	void testAssertFalse() {
	assertFalse("FirstName".length() == 10);
	assertFalse(10 > 20, "assertion message");
	}
	@Test
	void testAssertNull() {
	String str1 = null;
	String str2 = "abc";
	assertNull(str1);
	assertNotNull(str2);
	}



	@Test
	void testAssertAll() {
	String str1 = "abc";
	String str2 = "pqr";
	String str3 = "xyz";
	//Group many assertions and every assertion is executed even if one or
	//more of them fails
	assertAll("numbers",()->assertEquals(str1,"abc"),()->assertEquals(str2,"pqr"),()->assertEquals(str3,"xyz"));
	
	}
	
	

}
