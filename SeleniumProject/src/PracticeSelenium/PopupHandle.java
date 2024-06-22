package PracticeSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		//HiddenVisionPopUp
		
	/*	driver.findElement(By.xpath("//img[@alt='Login'][@class='-dOa_b L_FVxe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("")).sendKeys("985555");
	*/
		/*
		//AlertPopUp
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();	
		
		String a = alert.getText();	
		System.out.println(a);
		
		Thread.sleep(3000);
		alert.accept();
		*/
		
		//Confrim alert accept or reject
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		String a = alert.getText();
		System.out.println(a);
		if(a.contains(" ")) {
			alert.accept();
		}else {
			alert.dismiss();
		}
		
		Thread.sleep(4000);
		driver.close();
	}

}
