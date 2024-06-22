package BrowserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableDisplay {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		Thread.sleep(2000);

		boolean display = driver.findElement(By.xpath("//img[@class='standard_logo']")).isDisplayed();
	
		if (display)
			
			System.out.println("Logo is Displayed");
//		else
//			System.out.println("Logo is Missing");
		boolean enable = driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).isEnabled();
		if (enable)
			System.out.println("Button is Enabled");
		else
			System.out.println("Button is not clickable");
	}

}
