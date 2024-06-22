package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAlphabetically {

	//Alphabetically 
	 // ASCII Value -a=97 ,b=98, c=99
     //    A=65, B=66 C=67
	
	@Test
	public void sample() {
		Reporter.log("sample method", true);
	}
	@Test
	public void demo() {
		Reporter.log("demo method", true);
	}
	@Test
	public void test() {
		Reporter.log("test method", true);
	}
}
