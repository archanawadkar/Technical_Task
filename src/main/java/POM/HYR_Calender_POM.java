package POM;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HYR_Calender_POM {

	
	@FindBy(xpath="(//li[@class='parent'])[6]")private WebElement selenium;
	@FindBy(xpath="//a[text()='Calendars Practice']")private WebElement calender;
	@FindBy(xpath="//input[@id=\"second_date_picker\"]")private WebElement cal;
	@FindBy(xpath="//span[@class=\"ui-datepicker-month\"]")private WebElement month;
	@FindBy(xpath="//span[@class='ui-datepicker-year']")private WebElement year;
	@FindBy(xpath="//span[text()='Prev']")private WebElement previous;
	@FindBy(xpath="//span[text()='Next']")private WebElement next;
	@FindBy(xpath="//div[@class=\"ui-datepicker-title\"]")private WebElement mothyear;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']//td")private List<WebElement> alldateselector;
	
	
	public HYR_Calender_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selenium_Practice(WebDriver driver) {
	/*   Actions act=new Actions(driver);
	   act.moveToElement(selenium).build().perform();
		act.moveToElement(calender).click().perform();
	*/	
		selenium.click();
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", calender);
	calender.click();
	}
	
	public void ClickOncalender() {
		cal.click();//open the date picker
		//String yea="2024";
		//String mon="Aug";
		String dat="22";
		String month_year="August 2024";
		while(true) {
			
//		String months=month.getText();
//		String years=year.getText();
		
	/*	if(months.equalsIgnoreCase(mon)&& years.equalsIgnoreCase(yea)) {
			break;

		} */
		String moye=mothyear.getText();	
		if(moye.equalsIgnoreCase(month_year)) {
			break;
		}
		else {
			next.click();
		}	
		}
		for(WebElement ele:alldateselector) {
			String dt=ele.getText();
			if(dt.equalsIgnoreCase(dat)) {
				ele.click();
				break;
			}
		}
		
	}
	
	
	
}
