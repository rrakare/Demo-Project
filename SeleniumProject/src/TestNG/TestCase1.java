package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public void testmethod1() {
		//System.out.println("Test case running");
		Reporter.log("testmethod1 is running");
	}
	@Test
	public void testmethod2() {
		Reporter.log("testmethod2 is running");
	}
	@Test
	public void testmethod4() {
		Reporter.log("testmethod4 is running");
	}
	@Test
	public void testmethod3() {
		Reporter.log("testmethod3 is running");
	}
	@Test
	public void testmethod5() {
		Reporter.log("testmethod5 is running");
	}
}
