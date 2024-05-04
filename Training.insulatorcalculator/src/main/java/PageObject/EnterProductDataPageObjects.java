package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterProductDataPageObjects {
	
	@FindBy(id="startdate")
	WebElement date_startdate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="meritrating")
	WebElement dd_meritrating;
	

	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath="//input[@name=\"Optional Products[]\"]/parent::label")
	List<WebElement> chk_optionalProducts;
	
	@FindBy(id="courtesycar")
	WebElement dd_courtesycar;
	
	//Next button
	@FindBy(id="nextselectpriceoption")
	WebElement btn_next;

	public EnterProductDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
}
