package inheritance2;

public class BaldEagle extends Eagle {

	public static void main(String[] args) {

		BaldEagle b1 = new BaldEagle();
		b1.displayBird();
	}

	public BaldEagle() {
		super("DefaultBird", 2);
		System.out.println("From BaldEagle no arg cons");

	}
	
	// Rule1 same method signature + return type
	@Override // it will force to check overriding rule
	public void displayBird() {
		System.out.println("This is Bald Eagle");
		super.displayBird();
		//System.out.println(getName()+" "+getNumLeg());
	}
}
