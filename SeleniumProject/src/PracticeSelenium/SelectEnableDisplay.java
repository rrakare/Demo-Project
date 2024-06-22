package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectEnableDisplay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("//img[@id='logo']")).isDisplayed();
		if(result) {
			System.out.println("Logo is Displayed");
		}else {
			System.out.println("Logo is Missing");
		}
		boolean resultEnable = driver.findElement(By.xpath("//input[@id='Login']")).isEnabled();
		if(resultEnable) {
			System.out.println("Button is clickable");
		}else {
			System.out.println("Button is not clickable");
		}

	}

}
