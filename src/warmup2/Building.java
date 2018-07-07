package warmup2;

public class Building {
	private String name;
	private String type;
	private int floorCount;

	// Constructors
	public Building() {
		System.out.println("No arg cons from Building");
	}

	public Building(String name, String type, int floorCount) {
		this.name = name;
		this.type = type;
		this.floorCount = floorCount;
		System.out.println("3 args cons from Building");
	}

	// Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}

	// Methods
	@Override
	public String toString() {
		
		return "Building Info: "+name+" Type: "+type+" Floor Count: "+floorCount;
	}

	public void addFloor() {
		floorCount++;
		System.out.println("Floor count increase");
	}

	public void addDoor() {
		System.out.println("Door count increase");
	}

}
