package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);

		//Iframe handle to name, Id, webelemet and index
		//driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(1);
		WebElement elements = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(elements);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		String dateTime = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(dateTime);
	}

}
