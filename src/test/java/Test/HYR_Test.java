package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.HYR_Calender_POM;

public class HYR_Test {

	WebDriver driver;
	@BeforeMethod()
	public void Launch_Browser() {
	 driver=Browser.openbrowser("https://www.hyrtutorials.com/#");
	
	}
	@Test
	public void calender() {
        HYR_Calender_POM hYr_calender_POM=new HYR_Calender_POM(driver);
        hYr_calender_POM.selenium_Practice(driver);
        hYr_calender_POM.ClickOncalender();
	}
	
	
	
}
