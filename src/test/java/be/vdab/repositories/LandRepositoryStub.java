package be.vdab.repositories;

import be.vdab.entities.Land;

public class LandRepositoryStub implements LandRepository {

	public Land read(String landcode) {
		return new Land(landcode, 5);
	}

	public int findOppervlakteAlleLanden() {
		return 20;
	}
}