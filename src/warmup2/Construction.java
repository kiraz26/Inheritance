package warmup2;

public class Construction {

	public static void main(String[] args) {

		Building b1 = new Building("Two Towers", "Sauruman's House", 100);
		System.out.println(b1);
		SingleHouse sh1 = new SingleHouse("DeerCreestCourt", "Condo", 2, 50.0);
		System.out.println(sh1);
		//TownHouse th1 = new TownHouse( "Big Tower", "Tower", 100,true);
		sh1.addDoor();
		sh1.addFloor();
	}

}
