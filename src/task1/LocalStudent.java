package task1;

public class LocalStudent extends Student {

	int seatID;

	public LocalStudent() {
		// first line of constructor is an implicit call to super class's no arg
		// constructor
		// super();
		super("Emrah", 43); // once you call another constructor like this, compiler will not insert super()
							// in first line
		System.out.println("LocalStudent class no arg constructor");
	}

	public LocalStudent(int seatID) {
		//super();
		this(); // once another constructor is called , compiler will not insert super() in
				// first line
		this.seatID = seatID;
		System.out.println("LocalStudent class one arg constructor");
	}

	public void attendClassInPerson() {
		System.out.println("Valid message from LocalStudent class");
	}

}
