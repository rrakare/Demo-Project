package MockTestPak;

public class KeywordsClass {

	final int a=200;
	String name;

	KeywordsClass() {
		System.out.println("I am from KeywordsClass constructor");
	}

	KeywordsClass(String name) {
		System.out.println(name+ " I am from KeywordsClass parameterised constructor");
	}
	
	public void demo() {
		System.out.println("I am from demo method");
	}
}
