package BrowserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");

		List<WebElement> allFrame = driver.findElements(By.xpath("//input"));
		int frameCount = allFrame.size();
		System.out.println(frameCount);
		for (WebElement framefinds : allFrame) {
			System.out.println(framefinds);
			
		}

	}

}
