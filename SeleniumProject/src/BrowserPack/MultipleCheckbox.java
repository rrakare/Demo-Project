package BrowserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		String browser = "chrome";
		if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/radio.html");
			Thread.sleep(2000);
			List<WebElement> listOfCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

			for (int i = 0; i <= listOfCheckbox.size() - 1; i++) {
				Thread.sleep(2000);
				listOfCheckbox.get(i).click();
				// break;
			}
			// isSelected
//		boolean selectCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox1']"))
//				.isSelected();
//		System.out.print(selectCheckbox);
//		driver.quit();
//		}

//		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
//		Thread.sleep(2000);
//
//		boolean display = driver.findElement(By.xpath("//img[@class='standard_logo']")).isDisplayed();
//		if (display)
//			System.out.println("Logo is Displayed");
//		else
//			System.out.println("Logo is Missing");
//		boolean enable = driver.findElement(By.xpath("//input[@class='button r4 wide primary']")).isEnabled();
//		if (enable)
//			System.out.println("Button is Enabled");
//		else
//			System.out.println("Button is not clickable");
		}

	}
}
