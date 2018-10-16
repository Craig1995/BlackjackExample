package com.qa.myBlackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.*;

public class blackjackTest {
	static int x;
	@BeforeClass
	public static void befoore () {
		System.out.println("Welcome to my testy class");
	}
	@Before
	public void setup () {
		System.out.println(x+"/17");
	}
		
	Blackjack b = new Blackjack();
	@Test
	public void testy() {
		assertEquals("2 low invalid entries", 0, b.play(-10, -10));
	}
	@Test
	public void testy2() {
		assertEquals("1 low invalid, 1 valid", 0, b.play(-10, 10));
	}
	@Test
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
	public void testy6() {
		assertEquals("2 valid", 20, b.play(10, 20));
	}
	@Test
	public void testy7() {
		assertEquals("2 valid", 20, b.play(20, 10));
	}
	@Test
	public void testy8() {
		assertEquals("1 valid, 1 high valid", 10, b.play(10, 30));
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
	public void testy11() {
		assertEquals("1 high valid, 1 valid", 10, b.play(30, 10));
	}
	@Test
	public void testy12() {
		assertEquals("2 high valid", 0, b.play(30, 30));
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
	
	@After
	public void teardown() {
		System.out.println("test"+ x + "/17 is finished");
		x++;
	}
	
	@AfterClass
	public static void afters () {
		System.out.println("test class complete");
	}
	}

