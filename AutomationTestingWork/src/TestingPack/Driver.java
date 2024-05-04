package TestingPack;

public class Driver {
	//single level inheritance 
	public static void main(String[] args) {
		Tata drivCar = new Tata();
		drivCar.startCar();
		drivCar.stopCar();
		drivCar.carModel = "Punch";
		drivCar.cost = 700000;
		drivCar.version = 5;
		drivCar.numberOfGear = 5;
		drivCar.openSunroof();
	}

}
