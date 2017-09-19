package be.vdab.valueobjects;

public class Isbn {

	private String isbn;

	public Isbn(String isbn) {
		if (isbn.length() != 13){
			throw new IllegalArgumentException("Gelieven enkel 13 cijfers optegeven");
		}

		int oneven = 0;
		int even = 0;
		int laatsteGetal = Integer.parseInt(isbn.substring(isbn.length()-1));
		String isbn12Cijfers = isbn.substring(0,12);

		//Oneven Nr's optellen
		for (int i = 0; i < isbn12Cijfers.length(); i = i + 2){
				oneven += Integer.parseInt(isbn12Cijfers.substring(i,i+1));
		}
		//Even Nr's optellen
		for (int i = 1; i < isbn12Cijfers.length(); i = i + 2){
				even += Integer.parseInt(isbn12Cijfers.substring(i,i+1));
		}
		even *= 3;
		int somEvenOneven = oneven + even;
		int hogerTiental = ((somEvenOneven/10)+1)*10;
		if (hogerTiental - somEvenOneven == laatsteGetal || ((hogerTiental - somEvenOneven == 10) & laatsteGetal == 0)) {
			this.isbn = isbn;
		} else {
			throw new IllegalArgumentException("Controle getal is niet correct");
		}
	}

	@Override
	public String toString() {
		return isbn;
	}
}
