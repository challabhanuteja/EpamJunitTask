import static org.junit.Assert.*;

import org.junit.Test;
import com.epam.junit_task.*;
public class TestCases {
	Task t = new Task();
	@Test
	public void test1() {
		String expected = "BAA";
		String got = t.taskMethod("AABAA");
		assertEquals(expected,got);
	}
	@Test
	public void test2() {
		String expected = "AA";
		String got = t.taskMethod("AAAA");
		assertEquals(expected,got);
	}

	@Test
	public void test3() {
		String expected = "BAAAA";
		String got = t.taskMethod("ABAAAA");
		assertEquals(expected,got);
	}

	@Test
	public void test4() {
		String expected = "BCD";
		String got = t.taskMethod("ABCD");
		assertEquals(expected,got);
	}

	@Test
	public void test5() {
		String expected = "EFGH";
		String got = t.taskMethod("EFGH");
		assertEquals(expected,got);
	}

	@Test
	public void test6() {
		String expected = "IJKL";
		String got = t.taskMethod("IJKL");
		assertEquals(expected,got);
	}

	@Test
	public void test7() {
		String expected = "NT";
		String got = t.taskMethod("ANT");
		assertEquals(expected,got);
	}

	@Test
	public void test8() {
		String expected = "";
		String got = t.taskMethod("A");
		assertEquals(expected,got);
	}

	@Test
	public void test9() {
		String expected = "";
		String got = t.taskMethod("");
		assertEquals(expected,got);
	}

	@Test
	public void test10() {
		String expected = "BT";
		String got = t.taskMethod("BAT");
		assertEquals(expected,got);
	}
}
