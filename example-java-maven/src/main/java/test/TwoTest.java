package test;

import static org.junit.Assert.*;

import example.One;
import example.Two;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwoTest {
	private static One one;
	private static Two two;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		one = new One();
		two = new Two();	
	}
	
	@Test
	public void testComp() {
		// test pour comp 
		assertEquals("SUCCES",two.comp(one)); // a voir
		//assertEquals("ERROR",two.comp(null)); // a voir
	}
	
	@Test
	public void testEquals() {
		// test pour le equals
		assertEquals(true,two.equals(two));
		assertEquals(false,two.equals(one));
		assertEquals(false,two.equals(null));
		
		two.message=null;
		Two two2 = new Two();
		assertEquals(false,two.equals(two2));
		two2.message=null;
		assertEquals(true,two.equals(two2));
		
		two.message="foo";
		two2.message="fo";
		assertEquals(false,two.equals(two2));
		assertEquals(false,two2.equals(two));
	}
	
	@Test
	public void testHashCode() {
		assertEquals(101605,two.hashCode());
	}
}
