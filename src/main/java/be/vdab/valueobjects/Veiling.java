package be.vdab.valueobjects;

public class Veiling {

	private int hoogsteBod;

	public void doeBod(int bod){
		if (bod > hoogsteBod){
			hoogsteBod = bod;
		}
	}

	public int getHoogsteBod() {
		return hoogsteBod;
	}
}
