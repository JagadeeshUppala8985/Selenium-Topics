package Pratice;

abstract class Vehicle{
	abstract void Bike();
	void car() {
		System.out.println("It is non abstract method");
	}
}
class bike extends Vehicle{
	void Bike() {
		System.out.println("It is abstract method");
	}
}
public class Java_Abstraction {

	public static void main(String[] args) {
		Vehicle obj=new bike();
		obj.Bike();

	}

}