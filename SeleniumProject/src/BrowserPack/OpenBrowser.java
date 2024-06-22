package BrowserPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
	
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		
	}

}
