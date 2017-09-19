package be.vdab.valueobjects;

public class Woord {

	private final String woord;

	public Woord(String woord) {
		this.woord = woord.toLowerCase();
	}

	public boolean isPalindroom(){
		return woord.equals(new StringBuilder(woord).reverse().toString().toLowerCase());
	}
}
