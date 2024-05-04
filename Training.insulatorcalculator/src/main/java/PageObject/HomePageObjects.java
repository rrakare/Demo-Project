package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	//page object + respective methods
	WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	}

	//WebElement link_automobile = driver.findElement(x.path(""))// Without page factory
	//WebElement link_truck = driver.findElement(x.path(""))// Without page factory
	
	//page factory model
	@FindBy(id="nav_automobile")
	WebElement link_automobile;
	
	@FindBy(id="nav_truck")
	WebElement link_truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement link_motorcycle;
	
	@FindBy(id="nav_camper")
	WebElement link_camper;
	
	//constructor --to use initElement method
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
}
