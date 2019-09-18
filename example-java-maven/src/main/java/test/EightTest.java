package example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class EightTest {

	public static Eight eight;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		eight = new Eight();
	}
	
    @Test
    public void testLongString() {
    	// test pour longString()
    	assertEquals("xtest de -concat Eight.class", eight.concat("test de ","concat Eight.class" ));
    }
}
