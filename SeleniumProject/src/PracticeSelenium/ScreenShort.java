package PracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShort {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		for(int i=0; i<=2; i++) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		//Screenshot
//		TakesScreenshot sc = (TakesScreenshot)driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		System.out.println(source);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String random = RandomString.make(3);
		
		File dest = new File("C:\\Users\\Dell\\git\\repository\\SeleniumProject\\source\\akare"+random+".jpg");
		FileHandler.copy(source, dest);
		
		Thread.sleep(4000);
		driver.close();
		}
	}

}
