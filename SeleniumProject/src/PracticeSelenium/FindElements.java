package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> allTag = driver.findElements(By.xpath("//label"));
		int TotalTag = allTag.size();
		System.out.println(TotalTag);
		
		for(WebElement tagName: allTag) {
			Thread.sleep(2000);
			System.out.println(tagName.getText());
		}
		
		boolean logo = driver.findElement(By.xpath("//img[@name='logo']")).isDisplayed();
		if(logo)
		System.out.println(logo);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
