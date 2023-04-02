package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testjava {

	@FindBy(xpath="//a[contains(text(),'Click')]")private WebElement clicks;
	//@FindBy(xpath="//a[text()='Calendars Practice']")private WebElement calender;
	
	
	public Testjava(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click()  {
		clicks.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
