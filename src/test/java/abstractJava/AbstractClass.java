package abstractJava;

//Abstract class
abstract class Bike {

	// abstract method
	abstract void run();

}

class Car extends Bike {

	@Override
	void run() {
		System.out.println("Running safely...");

	}

}

public class AbstractClass {
	public static void main(String[] args) {
		Bike obj = new Car();
		obj.run();

	}

}
