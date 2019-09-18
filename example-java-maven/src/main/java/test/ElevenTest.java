package example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class ElevenTest {

	public static Eleven eleven;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		eleven = new Eleven();
	}
	
	@Test
    public void testTestValue() {
    	assertEquals(true, eleven.testValue("sdfghujil"));
    	assertEquals(true, eleven.testValue("xBA"));
    	assertEquals(false, eleven.testValue("xCBA"));
    	assertEquals(false, eleven.testValue("CBA"));
    	assertEquals(false, eleven.testValue("XYZ"));
    	assertEquals(false, eleven.testValue("DEF"));
    	assertEquals(false, eleven.testValue("ABC"));
    }


}
