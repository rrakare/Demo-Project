package MockTestPak;

public class Aanimal {

	public Aanimal() {
		System.out.println("Aanimal from Non parameterized method");
	}

	public Aanimal(int a) {
		System.out.println(a);
	}

	public Aanimal(String s) {
		System.out.println(s);
	}

	public void Dog() {
		System.out.println("Dog from Non parameterized method");
	}

	public void Dog(String s) {
		System.out.println("Dog " + s);
	}

	public void Cat() {
		System.out.println("Cat from Non parameterized method");
	}

	public void Cat(String s) {
		System.out.println("Cat " + s);
	}

	public void Cow() {
		System.out.println("Cow from Non parameterized method");
	}

	public void Cow(String s) {
		System.out.println("Cow " + s);
	}
}
