package be.vdab.valueobjects;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VeilingTest {

	private Veiling veiling;
	@Before
	public void before(){
		veiling = new Veiling();
	}

	@Test
	public void geenBodIsHoogsteNul(){
		int hoogsteBod = veiling.getHoogsteBod();
		assertEquals(0,hoogsteBod);
	}

	@Test
	public void hoogsteBod1000(){
		veiling.doeBod(1000);
		int hoogsteBod = veiling.getHoogsteBod();
		assertEquals(1000,hoogsteBod);
	}

	@Test
	public void hoogsteBod1000RareVolgorde(){
		veiling.doeBod(1000);
		veiling.doeBod(200);
		veiling.doeBod(500);
		int hoogsteBod = veiling.getHoogsteBod();
		assertEquals(1000,hoogsteBod);
	}

}