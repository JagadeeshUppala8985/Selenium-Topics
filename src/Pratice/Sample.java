package Pratice;
abstract class Vehicleone{
	abstract void Bike();
	void car() {
		System.out.println("It is car non abstract method");
	}
}
class bikeone extends Vehicleone{
	
	void Bike() {
		System.out.println("It is bike abstract method");
	}
}

public class Sample {

	public static void main(String[] args) {
		System.out.println("Abstract");
		Vehicleone obj=new bikeone();
		obj.car();
		obj.Bike();
	}

}
