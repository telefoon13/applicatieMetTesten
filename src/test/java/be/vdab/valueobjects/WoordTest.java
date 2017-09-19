package be.vdab.valueobjects;

import org.junit.Test;

import static org.junit.Assert.*;

public class WoordTest {

	@Test
	public void isEenPalindroom(){
		assertTrue(new Woord("Lepel").isPalindroom());
	}

	@Test
	public void isGeenPlalindroom(){
		assertFalse(new Woord("vork").isPalindroom());
	}

	@Test
	public void legeString(){
		assertTrue(new Woord("").isPalindroom());
	}

}