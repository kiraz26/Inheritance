package inheritanceintro;

public class Car extends Vehicle{ //extends keyword in java is used make one class inherit from another.
	//Vehicle is a Parent class
	//Car is a Child class
	//Vehicle is a Super class
	//Car is a Sub class
	//Car IS-a Vehicle !!!!
	//JAVA does not allow multiple inheritance.
	//A class can inherit from only one class
	
	public void accelerate() {
		System.out.println("car is acceletating");
	}
	
}
