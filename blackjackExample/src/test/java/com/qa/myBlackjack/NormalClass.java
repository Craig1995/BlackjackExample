package com.qa.myBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NormalClass {
	Blackjack b = new Blackjack();
	
	@Test
	public void testy6() {
		assertEquals("2 valid", 20, b.play(10, 20));
	}
	@Test
	public void testy7() {
		assertEquals("2 valid", 20, b.play(20, 10));
	}
	
}
