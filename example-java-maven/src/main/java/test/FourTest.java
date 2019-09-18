package test;

import static org.junit.Assert.*;

import example.Four;
import org.junit.BeforeClass;
import org.junit.Test;

public class FourTest {

	public static Four four;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		four = new Four();
	}

	@Test
	public void testGetMessage() {
		assertEquals(four.message,four.getMessage());
	}
	
	@Test
	public void testSetMessage() {
		four.setString("four");
		assertEquals("four",four.getMessage());
	}

	@Test
	public void testIsMessageEmpty() {
		four.setString(null);
		assertEquals(true,four.isMessageEmpty());
		four.setString("");
		assertEquals(true,four.isMessageEmpty());
		four.setString("four");
		assertEquals(false,four.isMessageEmpty());
	}
}
