package MockTestPak;

public class CarDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.startCar();
		c = new BMW();
		c.startCar();
		c = new AUDI();
		c.startCar();
	}

}
