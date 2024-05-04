package MockTestPak;

public class Demo {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.methodA();
		a.methodA(10);
		a.methodA(10.6f);
		a.methodA(5.5, "Raviraj");
		a.methodA("Raviraj");
		a.methodA("Raviraj", 2.2);
		a.methodA(true, 50);
	}

}
