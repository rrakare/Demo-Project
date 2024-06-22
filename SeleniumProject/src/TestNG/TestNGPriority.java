package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority = 1)
	public void TC1() {

		Reporter.log("TC1", true);
	}
	@Test(priority = 1)
	public void TC2() {

		Reporter.log("TC2", true);
	}
	@Test(priority = 1)
	public void TC3() {

		Reporter.log("TC3", true);
	}
	@Test(priority = 1)
	public void TC4() {

		Reporter.log("TC4", true);
	}
}
