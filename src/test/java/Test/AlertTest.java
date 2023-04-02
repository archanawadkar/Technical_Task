package Test;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.AlertPom;
@Listeners(TestListeners.class)
public class AlertTest {
     WebDriver driver;
	@BeforeMethod
	public void browser() {
		 driver=Browser.openbrowser("https://www.leafground.com/alert.xhtml");
	}
	
	@Test
	public void FirstAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnSimple();
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	@Test
	public void SecondAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnConfirm();
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	@Test
	public void ThirdAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnsimple_dialog();
	    alertPom.ClickOnDismiss();	
	}
	
	@Test
	public void FourthAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnsweet();
		alertPom.ClickOnClose(driver);		
	}
	
	@Test
	public void FifthAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnPromot();
		Alert a=driver.switchTo().alert();
		//Thread.sleep(2500);
		a.sendKeys("archana");
		a.accept();
		
	}
	@Test
	public void SixthAlert() {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnconfirmation();
	}
	@Test
	public void SeventhAlert() throws InterruptedException {
		AlertPom alertPom=new AlertPom(driver);
		alertPom.ClickOnMinMax();
	}
	
	
	
	
	
}
