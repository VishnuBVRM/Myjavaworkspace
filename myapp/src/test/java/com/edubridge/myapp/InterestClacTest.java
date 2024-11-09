package com.edubridge.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class InterestClacTest {
	private static InterestCalc c;
	
	@BeforeAll
	public static void setUp() {
		c = new InterestCalc();
	}
	
	@Test
	public void testSiWithSamllAmount() {
		double actual = c.si(10000, 12, 1);
		double expected = 1200;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSiWithBigAmount() {
		double actual = c.si(100000, 12, 1);
		double expected = 120000;
		assertEquals(expected, actual);
	}
}
