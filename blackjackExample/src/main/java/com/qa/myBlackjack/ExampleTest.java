package com.qa.myBlackjack;
import java.util.Arrays;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.stream.Collectors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ExampleTest {
	
	
@Parameters
public static Collection<Object[]> data(){
	return Arrays.asList(new Object[][] {{0,0,0}, {1,1,0}, {2,1,2}, {3,2,3}, {4,3,4}, {5,5,0}, {6,8,8}});
}
private int intPut1;
private int intPut2;
private int intExpected;

public ExampleTest(int input1, int input2, int expected) {
	intPut1 = input1;
	intPut2 = input2;
	intExpected = expected;
}

@Test
public void test() {
	Blackjack bj = new Blackjack();
	assertEquals(intExpected, bj.play(intPut1, intPut2));
}

}
