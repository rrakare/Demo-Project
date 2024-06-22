package BrowserPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Thread.sleep(2000);

		WebElement dropdownList = driver.findElement(By.xpath("//select[@class='col-lg-3' and @id='first']"));
		//System.out.println(dropdownList.getText());
		
//		String str=dropdownList.getText();
//		String[] str1=str.split("");
//		String str3="";
//		for(int i=0; i<str1.length; i++) {
//			str3=str3+str1[i];
//			System.out.println(" Not in");
//			break;
//		}
//		if(str3 == "Google")
//		System.out.println(str3);
		
		Select seList = new Select(dropdownList);
		
		Thread.sleep(2000);
		boolean result = seList.isMultiple();
		if (result) {
			System.out.println("Multiple option selectable");
		} else {
			System.out.println("Multiple option not selected");
		}

		// selection
		seList.selectByIndex(1);
		Thread.sleep(2000);
		seList.selectByValue("Apple"); 
		Thread.sleep(2000);
		seList.selectByVisibleText("Bing");
		
		List<WebElement> selectOption = seList.getAllSelectedOptions();
		for(WebElement sp: selectOption) {
			System.out.println(sp.getText());
		}
		
		WebElement heading = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']"));
		String st=heading.getText();
		System.out.println(st);
	}

}
