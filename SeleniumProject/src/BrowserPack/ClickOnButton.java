package BrowserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");

		Thread.sleep(2000);
		List<WebElement> listOfRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));

		for (int i = 0; i <= listOfRadioButton.size() - 1; i++) {
			Thread.sleep(2000);
			listOfRadioButton.get(i).click();

		}
		// isSelected
		boolean selectRadioBttn = driver.findElement(By.xpath("//input[@type='radio' and @value='Option 1']"))
				.isSelected();
		System.out.print(selectRadioBttn);

	}

}
