package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrower {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.getPageSource();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		driver.close();
	}

}
