package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterInsuratDataPageObjects {

	@FindBy(id="firstname")
	WebElement txt_firstnamee;
	
	@FindBy(id="lastname")
	WebElement txt_lastname;
	
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	
	//Gender
	@FindBy(xpath="//input[@name=\"Gender\"]/parent::label")
	List<WebElement> rdo_gender;
	
	@FindBy(id="streetaddress")
	WebElement txt_streetaddress;
	
	@FindBy(id="country")
	WebElement dd_country;
	
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	
	@FindBy(id="city")
	WebElement txt_city;
	
	@FindBy(id="occupation")
	WebElement dd_occupation;
	
	//Hobbies
	@FindBy(xpath="//input[@name=\"Hobbies\"]/parent::label")
	List<WebElement> chk_hobbies;
	
	@FindBy(id="website")
	WebElement txt_website;
	
	@FindBy(id="open")
	WebElement btn_open;
	
	//Next button
	@FindBy(id="nextenterproductdata")
	WebElement btn_next;
	
	//init
//	public EnterInsuratDataPageObjects() {
//		PageFactory.initElements(driver, this);
//	}
}
