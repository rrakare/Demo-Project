package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		act.moveToElement(loginButton).perform();
		
		Thread.sleep(2000);

		WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		act.contextClick(logo).perform();
		
		Thread.sleep(2000);

		List<WebElement> loginList = driver.findElements(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		for(WebElement list: loginList) {
			System.out.println(list.getText());
		}
		//act.moveToElement(loginButton).doubleClick().build().perform();
		//act.doubleClick(loginButton).perform();
		
		Thread.sleep(5000);
		driver.close();
	}

}
