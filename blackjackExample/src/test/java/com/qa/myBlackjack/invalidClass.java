package com.qa.myBlackjack;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class invalidClass {
	Blackjack b = new Blackjack();
	@Test
	public void testy() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}
	@Test
	public void testy2() {
		assertEquals("1 low invalid, 1 valid", 0, b.play(-10, 10));
	}@Test
	public void testy3() {
		assertEquals("1 low invalid, 1 high valid", 0, b.play(-10, 30));
	}
	@Test
	public void testy4() {
		assertEquals("1 low invalid, 1 high invalid", 0, b.play(-10, 50));
	}
	@Test
	public void testy5() {
		assertEquals("1 valid, 1  low invalid",0, b.play(10, -10));
	}
	@Test
	public void testy9() {
		assertEquals("1 valid, 1 high invalid", 0, b.play(10, 50));
	}
	@Test
	public void testy10() {
		assertEquals("1 high valid, 1 low invalid", 0, b.play(30, -10));
	}
	@Test
	public void testy13() {
		assertEquals("1 high valid, 1 high invalid", 0, b.play(30, 50));
	}
	@Test
	public void testy14() {
		assertEquals("1 high invalid, 1 low invalid", 0, b.play(50, -10));
	}
	@Test
	public void testy15() {
		assertEquals("1 high invalid, 1 low valid", 0, b.play(50, 10));
	}
	@Test
	public void testy16() {
		assertEquals("1 high invalid, 1 high valid", 0, b.play(50, 30));
	}
	@Test
	public void testy17() {
		assertEquals("2 high invalid", 0, b.play(50, 50));
	}

}
