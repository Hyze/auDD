package example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TenTest {

	public static Ten ten;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		ten = new Ten();
	}
	
	@Test
    public void testLongString() {
    	// test pour longString()
    	assertEquals(true, ten.isOdd(1));
    	assertEquals(false, ten.isOdd(2));
    }

}
