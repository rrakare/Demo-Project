package AbstractPak;

public class BusType extends RedBus{
	
	int busCost = 1500;
	
	public void Volvo_Bus_Type() {
		
		//float busCostPerKm = busCost/km;
		
		//System.out.println("Bus Cost per Km = "+busCostPerKm);
	}
	
	public void modeOfSitting() {
		float busCostPerKm = busCost/km;
		System.out.println("Bus Cost per Km = "+busCostPerKm);
		System.out.println("Sleeper Cost per sit  = "+sleeper_Cost);
		System.out.println("Sitting Cost per sit  = "+sitting_Cost);
	}

	public static void main(String[] args) {
		BusType busType= new BusType();
		busType.lalPari();
		busType.Volvo_Bus_Type();
		busType.modeOfSitting();
		
	}
}
