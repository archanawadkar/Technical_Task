package POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HYR_Window_POM {

	@FindBy(xpath="(//li[@class='parent'])[6]")private WebElement selenium;
	@FindBy(xpath="//a[text()='Window Handles']")private WebElement window;
	@FindBy(xpath="//button[@id='newWindowBtn']")private WebElement button1;
	@FindBy(xpath="//button[@id='newTabBtn']")private WebElement button2;
	@FindBy(xpath="//button[@id='newWindowsBtn']")private WebElement button3;
	@FindBy(xpath="//button[@id='newTabsBtn']")private WebElement button4;
	@FindBy(xpath="//button[@id='newTabsWindowsBtn']")private WebElement button5;
	WebDriver driver;
	public HYR_Window_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnSeleniumpractice(WebDriver driver) {
        selenium.click();	
       JavascriptExecutor excutor= (JavascriptExecutor)driver;
       excutor.executeScript("arguments[0].scrollIntoView()", window);
       window.click();
	}
	public void ClickButton1() {
		button1.click();
		Set<String>adres=driver.getWindowHandles();
		Iterator<String>ad=adres.iterator();
        String pr=ad.next();
        String ch=ad.next();
        driver.switchTo().window(ch);
        driver.close();
        //driver.switchTo().window(pr);
	}
	
	
	
	
	
	
	
	
}
