package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.FilePom;

public class FileTest {
   WebDriver driver;
	@BeforeMethod
	public void Openbrowser() {
		 driver=Browser.openbrowser("https://www.leafground.com/file.xhtml;jsessionid=node078j09kklr3dowvalst6gpr28462159.node0");
	}
	
	
	@Test
	public void FirstFileUpload() throws InterruptedException {
		FilePom filepom=new FilePom(driver);
		filepom.Choosefile();
		
	}
	
	@Test
	public void SecondFileDownload() {
		FilePom filepom=new FilePom(driver);
		filepom.Downloadfile();
	}
	
	@Test
	public void ThirdFileUpload() throws AWTException {
		FilePom filepom=new FilePom(driver);
		filepom.ChoosePic();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
