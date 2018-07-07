package inheritanceintro;

public class Garage {
	public static void main(String[] args) {
		Vehicle vehicle1=new Vehicle();
		vehicle1.drive();
		vehicle1.stop();
		vehicle1.make = "BMW";
		
		Car car1 = new Car();
		car1.drive();
		car1.stop();
		car1.make ="Mercedes";
		
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.stop();
		bus1.make="Safir";
		
		SportsCar spCar = new SportsCar();
		spCar.drive();
		spCar.stop();
		spCar.accelerate();
		spCar.make = "Ferrari";
		
		
	}
}
