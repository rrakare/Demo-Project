package MockTestPak;

public class TestAanimal extends Aanimal {

	

	public static void main(String[] args) {
		TestAanimal aani = new TestAanimal();
		Aanimal ann = new Aanimal(10);
		Aanimal ann2 = new Aanimal("Ravi");
	
		aani.Dog();
		aani.Dog("bauuuuuuuuuuuuuu");

		aani.Cat();
		aani.Cat("Maauuuu");

		aani.Cow();
		aani.Cow("ummbyaaaa");
		
	}

}
