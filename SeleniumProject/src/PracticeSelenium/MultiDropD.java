package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);
		
		WebElement picklist = driver.findElement(By.xpath("//select[@id='second']"));
		
		Select selPick = new Select(picklist);
		boolean selMulti = selPick.isMultiple();
		if(selMulti) {
			System.out.println("Mutiple options clickble");	
		}else {
			System.out.println("Mutiple options not clickble");
		}
		//Selection
		selPick.selectByIndex(0);
		Thread.sleep(3000);
		selPick.selectByValue("donut");
		Thread.sleep(3000);
		selPick.selectByVisibleText("Bonda");
		
		List<WebElement> selevtValue = selPick.getAllSelectedOptions();
		
		for(WebElement val: selevtValue)
		{
			System.out.println(val.getText());
		}
		
		/*
		//Deselection
		selPick.deselectByIndex(0);
		Thread.sleep(3000);
		selPick.deselectByValue("donut");
		Thread.sleep(3000);
		selPick.deselectByVisibleText("Bonda"); 
		
		//Selection Dropdown
		WebElement productList = driver.findElement(By.xpath("//select[@id='first']"));
		Select selPro = new Select(productList);
		
		WebElement product = selPro.getFirstSelectedOption();
		String a = product.getText();
		System.out.println(a);  */
		
		
		
		

		Thread.sleep(4000);
		driver.close();
		
	}

}
