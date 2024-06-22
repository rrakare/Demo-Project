package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionFunction2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement creatAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		act.moveToElement(creatAccount).click().build().perform();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		act.moveToElement(month).click().build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	}

}
