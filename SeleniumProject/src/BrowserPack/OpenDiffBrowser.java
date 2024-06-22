package BrowserPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenDiffBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");

		Thread.sleep(3000);
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumFiles\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");

		Thread.sleep(3000);
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumFiles\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		System.out.println("All driver run succesfully");
	}

}
