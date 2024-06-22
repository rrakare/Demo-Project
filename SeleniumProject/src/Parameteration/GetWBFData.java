package Parameteration;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetWBFData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Dell\\git\\repository\\SeleniumProject\\TestData\\Book1.xlsx");
		
		Workbook wbfData = WorkbookFactory.create(file);
		Sheet testData = wbfData.getSheet("TestData2");
		int colSize = testData.getRow(0).getLastCellNum();
		int rowSize = testData.getLastRowNum();
		
		for(int i=1; i<rowSize; i++) {
			
			for(int j=1; j<colSize; j++) {
				String testDat = testData.getRow(i).getCell(j).getStringCellValue();
				System.out.print(testDat+", ");
			}
			System.out.println();
		}
		

	}
	
}
