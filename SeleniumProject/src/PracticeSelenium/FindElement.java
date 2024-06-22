package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement checkboxEle = driver.findElement(By.xpath("//input[@type='email']"));
		Thread.sleep(3000);
		checkboxEle.sendKeys("raviraj.akaretest@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ravi@123");
		Thread.sleep(3000);
		
		System.out.println("Tag name: "+checkboxEle.getTagName());
		System.out.println("Text name: "+checkboxEle.getText());
		System.out.println("Accessible Name: "+checkboxEle.getAccessibleName());
		System.out.println("Size: "+checkboxEle.getSize());
		
		
		Thread.sleep(6000);
		driver.quit();
		

	}

}
