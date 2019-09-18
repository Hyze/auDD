package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiveTest {

    private static int test = 5;

    @Test
    public void testIntToString() {
	// test pour intToString()
	assertEquals("5", intToString(test));
    }

    @Test
    public void testIntToString1() {
	// test pour intToString()
	assertEquals("5", intToString1(test));
    }

    @Test
    public void testIntToString2() {
	// test pour intToString()
	assertEquals("5", intToString2(test));
    }

    @Test
    public void testIntToString3() {
	// test pour intToString()
	assertEquals("5", intToString3(test));
    }

}
