package test;

import static org.junit.Assert.assertEquals;

import example.One;
import example.Seven;
import org.junit.BeforeClass;
import org.junit.Test;

public class SevenTest {

	public static Seven seven;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		seven = new Seven();
	}
	
    @Test
    public void testLongString() {
    	// test pour longString()
    	assertEquals("foofoofoofoo", seven.longString(4));
		assertEquals("", seven.longString(0));
    }
    
    @Test
    public void testSetMessage() {
    	seven.setMessage("changement");
    	assertEquals(seven.getMessage(),"changement");
    }
    
    @Test
	public void testEquals() {
    	One one = new One();
    	
    	
		// test pour le equals
		assertEquals(true,seven.equals(seven));
		assertEquals(false,seven.equals(one));
		assertEquals(false,seven.equals(null));
		
		seven.setMessage(null);
		Seven s2 = new Seven();
		
		assertEquals(false,seven.equals(s2));
		
		s2.setMessage(null);
		assertEquals(true,seven.equals(s2));
		
		seven.setMessage("foo");
		s2.setMessage("fo");
		assertEquals(false,seven.equals(s2));
		assertEquals(false,s2.equals(seven));
		
		s2.setMessage("foo");
		assertEquals(true,s2.equals(seven));
	}
    
    
}
