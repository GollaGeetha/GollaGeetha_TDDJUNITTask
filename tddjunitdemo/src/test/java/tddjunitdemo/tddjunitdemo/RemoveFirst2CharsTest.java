package tddjunitdemo.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//A =>""
//AA=>""
//AABAA => BAA
//ABCD => BCD
//BACD => BCD
//BBAA => BBAA
//AB => B
//BA => B
//empty => ""

class RemoveFirst2CharsTest {
	RemoveFirst2Chars removeFirst2Chars;
	
	@BeforeEach
	
	void setUp()
	{
		removeFirst2Chars=new RemoveFirst2Chars();
	}
	@Test
	void testAChars() {
		assertEquals("",removeFirst2Chars.swap("A"));
	}
	@Test
	void testAAChars() {
		assertEquals("",removeFirst2Chars.swap("AA"));
	}
	@Test
	void testAABAAChars() {
		assertEquals("BAA",removeFirst2Chars.swap("AABAA"));
	}
	@Test
	void testABCDChars() {
		assertEquals("BCD",removeFirst2Chars.swap("ABCD"));
	}
	@Test
	void testBACDChars() {
		assertEquals("BCD",removeFirst2Chars.swap("BACD"));
	}
	@Test
	void testBBAAChars() {
		assertEquals("BBAA",removeFirst2Chars.swap("BBAA"));
	}
	@Test
	void testABChars() {
		assertEquals("B",removeFirst2Chars.swap("AB"));
	}
	@Test
	void testBAChars() {
		assertEquals("B",removeFirst2Chars.swap("BA"));
	}
	@Test
	void testemptyChars() {
		assertEquals("",removeFirst2Chars.swap(""));
	}
	
}
