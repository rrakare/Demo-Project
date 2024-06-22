package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);

		List<WebElement> radioCheck = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<=radioCheck.size()-1;i++) {
			radioCheck.get(i).click();
		}
	}

}
