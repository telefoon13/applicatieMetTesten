package be.vdab.valueobjects;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsbnTest {

	@Test
	public void correctISBNnummer() {
		new Isbn("9789027439642"); // dit mag geen exception veroorzaken
	}

	@Test
	public void correctISBNnummerMetControlleNummerNul() {
		new Isbn("9789028209510"); // dit mag geen exception veroorzaken
	}

	@Test(expected = NullPointerException.class)
	public void nummerMetNullIsVerkeerd() {
		new Isbn(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void leegNummerIsVerkeerd() {
		new Isbn("");
	}

	@Test
	public void toStringMoetHetNummerTeruggeven() {
		String nummer = "9789027439642";
		assertEquals(nummer, new Isbn(nummer).toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMet14CijfersIsVerkeerd() {
		new Isbn("09789027439642");
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMet12CijfersIsVerkeerd() {
		new Isbn("978902743964");
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerMetFoutControllerNummer() {
		new Isbn("978902743962");
	}

	@Test(expected = IllegalArgumentException.class)
	public void nummerDatGeenNummerIs() {
		new Isbn("abcdefghijklm");
	}

}