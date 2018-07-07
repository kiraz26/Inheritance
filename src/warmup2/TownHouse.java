package warmup2;

public class TownHouse extends Building {
	boolean isEndUnit;

	// Constructor
	public TownHouse(String name, String type, int floorCount, boolean isEndUnit) {
		super(name, type, floorCount);
		this.isEndUnit = isEndUnit;

		System.out.println("4 args cons from TownHouse");
	}

	@Override
	public void addDoor() {
		super.setFloorCount(5);
	}

	public String toString() {
		return super.toString() + " isEndUnit: " + isEndUnit + " | Town House";
	}
}
