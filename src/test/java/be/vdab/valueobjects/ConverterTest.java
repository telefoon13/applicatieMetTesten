package be.vdab.valueobjects;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ConverterTest {

	@Test
	public void eenInchIs2Punt54Centimeter(){
		Converter converter = new Converter();
		assertEquals(0, BigDecimal.valueOf(2.54).compareTo(converter.inchNaarCm(BigDecimal.ONE)));
	}

	@Test
	public  void tweehonderdInchIsVijfhonderdenachtCentimeter(){
		Converter converter = new Converter();
		assertEquals(0, BigDecimal.valueOf(508).compareTo(converter.inchNaarCm(BigDecimal.valueOf(200))));
	}

}