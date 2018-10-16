package com.qa.myBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class bustClass {
	Blackjack b = new Blackjack();
	
	@Test
	public void testy11() {
		assertEquals("1 high valid, 1 valid", 10, b.play(30, 10));
	}
	@Test
	public void testy12() {
		assertEquals("2 high valid", 0, b.play(30, 30));
	}
	@Test
	public void testy8() {
		assertEquals("1 valid, 1 high valid", 10, b.play(10, 30));
	}
}
