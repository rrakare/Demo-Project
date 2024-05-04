package MockTestPak;

public class Test_Main {

	public static void main(String[] args) {
		Animal lion = new Lion(); //up-casting
		lion.sound();
		
		Tiger tiger = new Tiger();
		tiger.sound();
	}

}
