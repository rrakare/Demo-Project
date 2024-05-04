package TestingPack;

public class TestClass {

	int a = 10;
	static int b = 20;

	public void method() {

		int c = 30;
		String d = "Ravi";
		float fl = 12025f;
		System.out.println(c+" "+d+" "+fl);
	}
	
	public static void methodSec() {
		int f=10;
		int k=5;
		int g = f/k;
		System.out.println(g);
		}
	public void revOddNumber() {
		int a =50;
		
		for (int i=a; i>=0; i-=2) {
			System.out.print(i+" ");
		}
	}
}
