package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicleDataPageObjects {

	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(id="numberofseats")
	WebElement dd_numberofseats;
	
	@FindBy(id="fuel")
	WebElement dd_fuel;
	
	@FindBy(id="listprice")
	WebElement txt_listprice;
	
	@FindBy(id="licenseplatenumber")
	WebElement txt_licenseplatenumber;
	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;
	
	//Next button
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_next;
	
	//init
	public EnterVehicleDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
}
