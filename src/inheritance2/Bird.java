package inheritance2;

public class Bird {
	private String name;
	private int numLeg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumLeg() {
		return numLeg;
	}

	public void setNumLeg(int numLeg) {
		this.numLeg = numLeg;
	}

	public Bird() {
		System.out.println("no arg cons from Bird");
	}

	public Bird(String name, int numLeg) {
		this.name=name;
		this.numLeg=numLeg;
		System.out.println("2 arg cons from Bird");
	}

}
