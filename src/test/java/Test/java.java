package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.FilePom;
import POM.Testjava;

public class java {

	
	 WebDriver driver;
		@BeforeMethod
		public void Openbrowser() {
			 driver=Browser.openbrowser("http://uitestingplayground.com/");
		}
		
		
		@Test
		public void First() throws InterruptedException {
			Testjava testjava=new Testjava(driver);
			testjava.click();
		}	
	
	
	
	
	
	
	
	
	
	
}
