package be.vdab.services;

import be.vdab.entities.Land;
import be.vdab.repositories.LandRepository;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LandServiceTest {

	private LandRepository landRepository;
	private LandService landService;

	@Before
	public void before() {
		landRepository = mock(LandRepository.class);
		when(landRepository.findOppervlakteAlleLanden()).thenReturn(20);
		when(landRepository.read("B")).thenReturn(new Land("B", 5));
		landService = new LandService(landRepository);
	}

	@Test
	public void findVerhoudingOppervlakteLandTovOppervlakteAlleLanden() {
		assertEquals(0, BigDecimal.valueOf(0.25).compareTo(landService.findVerhoudingOppervlakteLandTovOppervlakteAlleLanden("B")));
		verify(landRepository).findOppervlakteAlleLanden();
		verify(landRepository).read("B");
	}
}