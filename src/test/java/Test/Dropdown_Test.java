package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.DropDown;

public class Dropdown_Test {
  WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver=Browser.openbrowser("https://www.leafground.com/select.xhtml");
	}
	
	@Test
	public void Select1drop() throws InterruptedException {
		DropDown dropDown=new DropDown(driver);
		dropDown.ClickOn1();
		dropDown.ClickOn2(driver);
		Thread.sleep(2000);
		dropDown.ClickOn3(driver);
	}
	
	
	
	
	
	
	
	
}
