package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllaTest {

	@Test
	public void test() {
		System.out.println("Expected: Testing JUnit 4.12; Actual: " + Alla.str);
		assertEquals("Text is different", "Testing JUnit 4.12", Alla.str);
	}
}
