package example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class FiveTest {

	public static Five five;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		five = new Five();
	}
	
    private static int test = 5;

    @Test
    public void testIntToString() {
	// test pour intToString()
	assertEquals("5", five.intToString(test));
    }

    @Test
    public void testIntToString1() {
	// test pour intToString()
	assertEquals("5", five.intToString1(test));
    }

    @Test
    public void testIntToString2() {
	// test pour intToString()
	assertEquals("5", five.intToString2(test));
    }

    @Test
    public void testIntToString3() {
	// test pour intToString()
	assertEquals("5", five.intToString3(test));
    }

}
