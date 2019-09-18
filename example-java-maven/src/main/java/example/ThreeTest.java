package example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ThreeTest {

	private static One one;
	private static Two two;
	private static Three three;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		one = new One();
		two = new Two();
		three = new Three();
		one.message="foo1";
		two.message="foo2";
		three.message="foo3";
	}

	@Test
	public void testConcat() {
		assertEquals("foo3foo2",three.concat(two));
	}
	
	@Test
	public void testConcat2() {
		assertEquals("foo3foo1",three.concat2(one));
	}
	
	@Test
	public void testConcat3() {
		assertEquals("foo3_foo1-foo2",three.concat3(one,two));
	}
}