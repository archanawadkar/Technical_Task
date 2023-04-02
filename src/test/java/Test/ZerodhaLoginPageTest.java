package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import POJO.Browser;
import POM.ZerodhLoginPage;
import Utility.Parametrization;

public class ZerodhaLoginPageTest {

	
	public void LoginWithvalidCreditals() throws EncryptedDocumentException, IOException {
		WebDriver driver=Browser.openbrowser("https://kite.zerodha.com/");
		ZerodhLoginPage obj=new ZerodhLoginPage(driver);
	    String username=Parametrization.getData("Data", 0, 1);
	    obj.enteruserId(username);
	    String password=Parametrization.getData("Data", 1, 1);
        obj.enterpassword(password);	    
	    obj.ClickOnLogin();
	}
	
	
	
	
}
