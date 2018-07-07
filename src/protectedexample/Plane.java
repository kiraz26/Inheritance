package protectedexample;

import inheritanceintro.Vehicle;

public class Plane extends Vehicle { //we should import for extends Vehicle
	
	// protected String make is only visible within the child class.
	
	public void setPlaneMake(String planeMake) {
		make = planeMake;
	}
	
	public String getPlaneMake() {
		return make;
	}

}
