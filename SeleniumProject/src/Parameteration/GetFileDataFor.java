package Parameteration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFileDataFor {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\git\\repository\\SeleniumProject\\TestData\\Book1.xlsx");
		Workbook wbfData = WorkbookFactory.create(file);
		Sheet dataSheet = wbfData.getSheet("TestData");
		int rowSize = dataSheet.getRow(0).getLastCellNum();
		int colSize = dataSheet.getRow(0).getLastCellNum();
		
//		for(int i=0; i<rowSize;i++) {
//			for(int j=1;j<colSize; j++) {
//				if() {
//					String userName = dataSheet.getRow(i).getCell(j).getStringCellValue();
//				}
//			}
//		}
		String userName = dataSheet.getRow(0).getCell(1).getStringCellValue();
		String password = dataSheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(userName);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://pulse5-dev-ed.develop.my.salesforce.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
