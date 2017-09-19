package be.vdab.services;

import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class WinstServiceTest {

	private WinstService winstService;
	private OpbrengstRepository opbrengstRepository;
	private KostRepository kostRepository;

	@Before
	public void before() {
		opbrengstRepository = mock(OpbrengstRepository.class);
		when(opbrengstRepository.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(200));
		kostRepository = mock(KostRepository.class);
		when(kostRepository.findTotaleKost()).thenReturn(BigDecimal.valueOf(169));
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}

	@Test
	public void winstIsOpbrengstMinKost() {
		assertEquals(0, BigDecimal.valueOf(31).compareTo(winstService.getWinst()));
		verify(opbrengstRepository).findTotaleOpbrengst();
		verify(kostRepository).findTotaleKost();
	}
}