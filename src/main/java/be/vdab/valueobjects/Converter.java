package be.vdab.valueobjects;

import java.math.BigDecimal;

public class Converter {

	private static final BigDecimal AANTAL_CM_IN_EEN_INCH = BigDecimal.valueOf(2.54);

	public BigDecimal inchNaarCm(BigDecimal inches) {
		return inches.multiply(AANTAL_CM_IN_EEN_INCH);
	}
}
