package task8tdd;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;


public class Testcases extends TestCase {
	@Test
	public void test() {
	testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("ABCD");
		assertEquals("BCD",out);
	}
	@Test
	public void test1() {
		testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("AACD");
		assertEquals("CD",out);
	}
	@Test
	public void test2() {
		testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("BACD");
		assertEquals("BCD",out);
	}
	@Test
	public void test4() {
		testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("BBAA");
		assertEquals("BBAA",out);
	}
	@Test
	public void test5() {
		testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("AAAAAAAAAAA");
		assertEquals("AAAAAAAAA",out);
	}
	@Test
	public void test6() {
		testcases_demo  t=new testcases_demo ();
		String out=t.valid_string("AABAA");
		assertEquals("BAA",out);
	}


}
