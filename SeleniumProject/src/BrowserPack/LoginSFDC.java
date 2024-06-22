package BrowserPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSFDC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("raviraj.akaretest@gmail.com");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("Ravi@123");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

}
