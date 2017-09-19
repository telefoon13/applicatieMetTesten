package be.vdab.valueobjects;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RekeningTest {

	private Rekening rekening;

	@Before
	public void before(){
		rekening = new Rekening();
	}

	@Test
	public void hetSaldoVanEenNieuweRekeningIsNul() {
		assertEquals(0, BigDecimal.ZERO.compareTo(rekening.getSaldo()));
	}

	@Test
	public void hetSaldoNaEenEersteStortingIsHetBedragVanDieStorting() {
		BigDecimal bedrag = BigDecimal.valueOf(2.5);
		rekening.storten(bedrag);
		assertEquals(0, bedrag.compareTo(rekening.getSaldo()));
	}

	@Test
	public void hetSaldoNaTweeStortingenIsDeSomVanDeBedragenVanDieStortingen() {
		rekening.storten(BigDecimal.valueOf(2.5));
		rekening.storten(BigDecimal.valueOf(1.2));
		assertEquals(0, BigDecimal.valueOf(3.7).compareTo(rekening.getSaldo()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void stortingMagNietNulZijn(){
		rekening.storten(BigDecimal.ZERO);
	}

	@Test(expected = IllegalArgumentException.class)
	public void stortingMagNietNegatiefZijn(){
		rekening.storten(BigDecimal.valueOf(-1));
	}

	@Test(expected = NullPointerException.class)
	public void stortingMagNietNullZijn(){
		rekening.storten(null);
	}
}