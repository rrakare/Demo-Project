package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGInvocationCount {

	@Test(invocationCount=4)
	public void TC1() {

		Reporter.log("TC1 Pass", true);
	}

	@Test
	public void TC2() {

		Reporter.log("TC2 Pass", true);
	}

	@Test
	public void TC3() {

		Reporter.log("TC3 Pass", true);
	}
	
	@Test
	public void TC4() {
		Reporter.log("TC4 Pass", true);

	}
}
