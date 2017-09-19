package be.vdab.valueobjects;

import java.math.BigDecimal;

public class Rekening {

	private BigDecimal saldo = BigDecimal.ZERO;

	public void storten(BigDecimal bedrag) {
		if (bedrag.compareTo(BigDecimal.ZERO) <= 0){
			throw new IllegalArgumentException("Positieve bedraggen aub.");
		}
		saldo = saldo.add(bedrag);
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

}