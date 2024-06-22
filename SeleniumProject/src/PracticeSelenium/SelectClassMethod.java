package PracticeSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
//		WebElement listYear = driver.findElement(By.xpath("//select[@id='year']"));
//
//		Select sel = new Select(listYear);
//		// Get All option
//		List<WebElement> yearOption = sel.getOptions();
//
//		System.out.println(yearOption.size());
//
//		sel.selectByIndex(5);
//		Thread.sleep(3000);
//		sel.selectByValue("1990");
//		Thread.sleep(3000);
//		sel.selectByVisibleText("1905");
//
//		for (WebElement yr : yearOption) {
//			System.out.println(yr.getText());
//		}

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select selMonth = new Select(month);
		List<WebElement> monthOp = selMonth.getOptions();

		for (WebElement mon : monthOp) {
			System.out.println(mon.getText());
		}

		///Day option
		
		System.out.println("-----------------------");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select selDay = new Select(day);
		List<WebElement> dayOp = selDay.getOptions();

		for (WebElement da : dayOp) {
			System.out.println(da.getText());
		}

		Thread.sleep(4000);
		driver.close();
	}

}
