package MockTestPak;

public class AccessSpecifier {

	
	int a=10;
	private void method() {
		System.out.println("Method form = Private");
	}
	 void method1() {
		System.out.println("Method1 form = deflaut");
	}
	protected void method2() {
		System.out.println("Method2 form = Protected");
	}
	public void method3() {
		System.out.println("Method3 form = public");
	}
}
