package TestingPack;

public class methodDemo {

	public static void main(String[] args) {
		System.out.println("I am from static method");

		System.out.println("=======================");

		methodDemo methodD = new methodDemo();
		methodD.main();
		add();
		methodD.multiple();
		division(100, 100);
		methodD.substraction(200, 100);
		methodD.stringMethod("Bhagwan");
		 
		methodDemo1 methodD1 = new methodDemo1();
		methodD1.stringmethod();
		methodDemo1.concantanation();
		
		methodD1.stringmethod1("methodDemo1");
		methodDemo1.stringmethod2(200, 300);

	}

	public void main() {
		System.out.println("I am from non static method");

	}

	public static void add() {

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("a+b = " + c);
	}

	public void multiple() {

		int a = 20;
		int b = 30;
		int c = a * b;
		System.out.println("a*b = " + c);
	}

	public static void division(int a, int b) {

		int c = a / b;
		System.out.println("a/b = " + c);
	}

	public void substraction(int a, int b) {

		int c = a - b;
		System.out.println("a-b = " + c);
	}
	
	public void stringMethod(String s) {

		
		System.out.println("Bole toh apun hi " + s);
	}
}
