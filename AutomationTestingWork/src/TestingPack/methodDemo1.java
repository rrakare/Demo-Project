package TestingPack;

public class methodDemo1 {

	public void stringmethod() {

		System.out.println("I am from methodDemo1 class");
	}

	public static void concantanation() {

		String s1 = "my name is ";
		String s2 = "Ravi";
		String s3 = s1 + s2;
		System.out.println(s3);
	}

	public void stringmethod1(String s) {

		System.out.println("I am from " +s+ " class");
	}

	public static void stringmethod2(int a, int b) {

		System.out.println("a+b = "+(a+b));
	}

}
