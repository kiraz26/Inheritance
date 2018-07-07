package inheritance2;

public class Eagle extends Bird {
	String name;

	public Eagle() {
		super();
		System.out.println("Eagle no arg cons");
	}

	public Eagle(String name, int numLeg) {
		super(name, numLeg);
		
		System.out.println("Eagle no arg cons");
	}
	
	public  void displayBird() {
		System.out.println(getName()+" "+getNumLeg());
	}

	public  static void main(String[] args) {
		Eagle e1 = new Eagle("Eagle", 2);

		System.out.println(e1.name);
		System.out.println(e1.getName());

	}
}
