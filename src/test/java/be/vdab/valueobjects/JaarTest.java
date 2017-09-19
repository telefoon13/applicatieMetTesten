package be.vdab.valueobjects;

import static org.junit.Assert.*;
import org.junit.Test;

public class JaarTest {

	@Test
	public void eenJaarDeelbaarDoor400(){
		assertTrue(new Jaar(2000).isSchrikkelJaar());
	}

	@Test
	public void eenJaarDeelbaarDoor100(){
		assertFalse(new Jaar(1900).isSchrikkelJaar());
	}

	@Test
	public void eenJaarDeelbaarDoor4(){
		assertTrue(new Jaar(2012).isSchrikkelJaar());
	}

	@Test
	public void eenJaarNietDeelbaarDoor4(){
		assertFalse(new Jaar(2015).isSchrikkelJaar());
	}

	@Test
	public void equalsTweeZelfdeJaren(){
		assertEquals(new Jaar(2015), new Jaar(2015));
	}

	@Test
	public void equalsTweeVerschillendeJaren(){
		assertNotEquals(new Jaar(2015), new Jaar(2016));
	}

	@Test
	public void hashcodeTweeZelfdeJaren(){
		assertEquals(new Jaar(2015).hashCode(), new Jaar(2015).hashCode());
	}
}