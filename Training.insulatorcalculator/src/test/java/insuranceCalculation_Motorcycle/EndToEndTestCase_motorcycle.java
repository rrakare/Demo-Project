package insuranceCalculation_Motorcycle;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testbase.TestBase;

public class EndToEndTestCase_motorcycle extends TestBase{

	@Test
	public void insuranceCalculate_VolvoMotor() {
		LaunchBrowserAndNavigate();
		System.out.println(driver.getTitle());
		
		
		
	}
	
}
