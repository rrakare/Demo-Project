package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=0; i<=checkBox.size()-1; i++) {
			Thread.sleep(3000);
			checkBox.get(i).click();
			break;
		}
//		for(WebElement c: checkBox) {
//			c.click();
//		}
		
		boolean selectResult = driver.findElement(By.xpath("//input[@value='checkbox1']")).isSelected();
        System.out.println(selectResult);
		
		Thread.sleep(5000);
		driver.close();
	}

}
