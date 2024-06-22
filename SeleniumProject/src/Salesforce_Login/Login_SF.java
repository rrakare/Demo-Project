package Salesforce_Login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_SF {

	static WebDriver  driver;
	
	@Test(priority=1)
	public static void OpenBrowser() {
	
	   driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=2)
	public static void Login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kalpeshshirode88@brave-impala-80re4w.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Devansh@2020");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	@Test(priority=3)
	public static void AppLauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		List<WebElement> listApp = driver.findElements(By.xpath("//div[@class='slds-size_small']//lightning-formatted-rich-text//span//p"));
		
		System.out.println(listApp.size());
		String str1="Sales";
		for(WebElement app:listApp) {
			
			String str2=app.getText();
			System.out.println(app.getText());
			
			if(str1.equals(str2)) {
				app.click();
			}
		}
	}
	
}
