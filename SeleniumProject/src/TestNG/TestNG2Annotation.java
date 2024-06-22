package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2Annotation {

	@Test
	public void Login() {
		Reporter.log("Login done succesfully",true);
	}
	@AfterClass
	public void OpenBrower() {
		Reporter.log("Brower open succesfully",true);
	}
	@AfterMethod
	public void CloseBrower() {
		Reporter.log("Brower close succesfully",true);
	}
	@BeforeClass
	public void LogOut() {
		Reporter.log("Logout succesfully",true);
	}
	@BeforeMethod
	public void TestCase() {
		Reporter.log("Test case run succesfully",true);
	}
}
