package be.vdab.services;

import be.vdab.repositories.LandRepository;
import be.vdab.repositories.LandRepositoryStub;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class LandServiceTest {

	private LandRepository landRepository;
	private LandService landService;

	@Before
	public void before() {
		landRepository = new LandRepositoryStub();
		landService = new LandService(landRepository);
	}

	@Test
	public void findVerhoudingOppervlakteLandTovOppervlakteAlleLanden() {
		assertEquals(0, BigDecimal.valueOf(0.25).compareTo(
				landService.findVerhoudingOppervlakteLandTovOppervlakteAlleLanden("B")));
	}
}