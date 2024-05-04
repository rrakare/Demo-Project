package TestingPack;

public class TestContructor {

	TestContructor(int a, float b, double n, long h) {
		
		System.out.println(b);
		//call same class method in the constructor
		method1(10, 10.355555f, 5884458, 14555555l); // pass the parameter of the call method 
		
	}

	TestContructor(){
		System.out.println("I am from non parameterized constructor");
	}

	public static void method1(int a, float b, double n, long h) {

		System.out.println(a + " " + b + " " + n + " " + h);
		
	}
	
}
