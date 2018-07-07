package protectedexample;

import inheritanceintro.Vehicle;

public class Main {
	public static void main(String[] args) {
		Vehicle veh = new Vehicle(); //we should import
		//veh.make = "Volvo";  make is protected and not visible in different package
		//veh.drive(); is not visible because of default
		Plane plane = new Plane();
		//plane.make = "Boeing"; make is not accessible just accessible extends class  
		plane.setPlaneMake("Boeing");
		plane.getPlaneMake();
		System.out.println(plane.getPlaneMake());
	}
}
