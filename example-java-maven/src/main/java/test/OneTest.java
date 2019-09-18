package test;

import static org.junit.Assert.*;


import example.One;
import org.junit.BeforeClass;
import org.junit.Test;

public class OneTest {
	
	private static One un;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		un = new One();
	}
	
	@Test
	public final void testFoo() {
		assertEquals(un.message, un.foo());
	}
}
