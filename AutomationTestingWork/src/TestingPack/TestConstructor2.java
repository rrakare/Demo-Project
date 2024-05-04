package TestingPack;

public class TestConstructor2 {

	int a;
	float b;
	double n;
	long h;
	public static void main(String[] args) {
		
		// call TestContructor class constructor and create object only
		TestContructor testCon = new TestContructor(10, 10, 200f, 2300l);
		TestContructor contest = new TestContructor();
	}
}
