package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class VideoPom {
       @FindBy(xpath="//video[@id=\"myvideo\"]")private WebElement A;
       @FindBy(xpath="//video[@id=\"myvideo1\"]")private WebElement B;
	
	
	
	
	
	public VideoPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
       
   public void FirstVideo(WebDriver driver) throws InterruptedException {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));
	   wait.until(ExpectedConditions.visibilityOf(A));  
	   A.click();
   }
       
   public void SecondVideo() {
	   B.click();
   }
       
       
       
       
}
