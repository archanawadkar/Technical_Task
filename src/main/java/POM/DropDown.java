package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    @FindBy(css="select[class=\"ui-selectonemenu\"]")private WebElement select1;
    @FindBy(xpath="//label[@id='j_idt87:country_label']")private WebElement select2;
    @FindBy(xpath="//li[@id='j_idt87:country_3']")private WebElement india;
    @FindBy(xpath="//label[@id='j_idt87:city_label']")private WebElement select3;
    
    @FindBy(xpath="//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/ul[1]")private WebElement select4;
    @FindBy(xpath="//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")private WebElement choose;
    @FindBy(xpath="//li[contains(text(),'Selenium WebDriver')]")private WebElement selenium;
    @FindBy(xpath="//li[contains(text(),'JMeter')]")private WebElement jmeter;
    @FindBy(xpath="//li[contains(text(),'RestAssured')]")private WebElement RestApi;
    
    @FindBy(xpath="//label[@id=\"j_idt87:lang_label\"]")private WebElement select5;
    @FindBy(xpath="//label[@id=\"j_idt87:value_label\"]")private WebElement select6;

    
    public DropDown(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    
    public void ClickOn1() {
    	Select se=new Select(select1);
    	se.selectByIndex(1);
    }
    
    public void ClickOn2(WebDriver driver) {
    	select2.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(india).click().build().perform();
    }
    
    public void ClickOn3(WebDriver driver) throws InterruptedException {
    	choose.click();
    	Actions a=new Actions(driver);
    	Thread.sleep(1000);
    	a.moveToElement(selenium).click().build().perform();
    	choose.click();
    	Thread.sleep(1000);

    	a.moveToElement(jmeter).click().build().perform();  	
    	choose.click();
    	Thread.sleep(1000);
    	a.moveToElement(RestApi).click().build().perform();
    }
    
    public void ClickOn4() {
    	
    }
    public void ClickOn5() {
    	
    }
    
    
    
    
    
    
}
