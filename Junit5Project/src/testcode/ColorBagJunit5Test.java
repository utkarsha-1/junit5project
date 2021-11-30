package testcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import businesscode.ColorBag;

class ColorBagJunit5Test {
	
	private ColorBag colorBag;
	//The @BeforeEach annotation denotes that the annotated method should be executed before each @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class. It is executed only once.

	@BeforeEach
	void setUp() throws Exception {
		colorBag=new ColorBag();
		colorBag.add("red");
		colorBag.add("green");
		colorBag.add("yellow");
		colorBag.add("blue");
		colorBag.add("magenta");
		colorBag.add("brown");
		
	}

	@Test
	@DisplayName("Added color should be in bag")
	void testAdd() {
		var newColor="pink";
		colorBag.add(newColor);
		assertTrue(colorBag.contains(newColor));
	}

	@Test
	@DisplayName("Removed color should not be in bag")
	void testRemove() {
		var color="green";
		colorBag.remove(color);
		assertFalse(colorBag.contains(color));
	}

	@Test
	@DisplayName("Color Bag Set should be transformed into list")
	void testToList() {
		var myList=Arrays.asList("red","green","yellow","blue","magenta","brown");
		var colorList=colorBag.toList();
		Collections.sort(myList);
		Collections.sort(colorList);
		assertEquals(colorList,myList);
	}


	@Test
	void testSize() {
		int bSize=colorBag.size();
		assertEquals(6,bSize,"failure");
	}

}
