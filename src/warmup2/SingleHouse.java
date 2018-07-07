package warmup2;

public class SingleHouse extends Building {
	double hoaFee;

	// Constructor
	public SingleHouse(String name, String type, int floorCount, double hoaFee) {
		super(name, type, floorCount);
		this.hoaFee = hoaFee;
		System.out.println("4 args cons from SingleHouse");
	}

	@Override
	public void addDoor() {

		System.out.println("Adding door for single house");
	}

	@Override
	public void addFloor() {
		super.addFloor();
		System.out.println("Adding floor for single house");
	}

	@Override
	public String toString() {
		return super.toString() + " Hoa Fee: " + hoaFee+" | Single House";
	}
}
