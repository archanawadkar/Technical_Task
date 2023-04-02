package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.HYR_Window_POM;

public class HYR_Window_Test {
   WebDriver driver;
	
	
	@BeforeMethod
	public void launchbrowser() {
		driver=Browser.openbrowser("http://uitestingplayground.com/");
	//	HYR_Window_POM hYR_Window_POM=new HYR_Window_POM(driver);
	//	hYR_Window_POM.ClickOnSeleniumpractice(driver);
	}
	
	
	@Test
	public void First_window() throws InterruptedException {
		HYR_Window_POM hYR_Window_POM=new HYR_Window_POM(driver);
		hYR_Window_POM.ClickButton1();
		
	}
	
	@Test
	public void Second_window() {
		
	}
}
