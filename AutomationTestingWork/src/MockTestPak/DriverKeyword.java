package MockTestPak;

public class DriverKeyword extends KeywordsClass {

	int a = 100;

	public DriverKeyword() {

	}

	public DriverKeyword(String name) {

	}

	public void demo1() {
		int a = super.a;
		super.demo();

		System.out.println(a + " , " + this.a);
	}
}
