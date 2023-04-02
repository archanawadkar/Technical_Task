package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class AlertPom {

	@FindBy(xpath="//button[@id=\"j_idt88:j_idt91\"]") private WebElement simple;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt93\"]")private WebElement confirm;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt95\"]")private WebElement simple_dialog ;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt98\"]")private WebElement dismiss;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt100\"]")private WebElement sweet;
	@FindBy(xpath="(//a[@aria-label=\"Close\"])[2]")private WebElement close;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt104\"]")private WebElement prompt_dialog;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt106\"]")private WebElement confirmation ;
	@FindBy(xpath="//span[text()='Confirmation']")private WebElement text;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt108\"]")private WebElement yes;
	@FindBy(xpath="//button[@id=\"j_idt88:j_idt111\"]")private WebElement minmax;
	@FindBy(xpath="(//span[@class=\"ui-icon ui-icon-closethick\"])[3]")private WebElement closed;
	@FindBy(xpath="//span[@class=\"ui-icon ui-icon-minus\"]")private WebElement min;
	@FindBy(xpath="//span[@class=\"ui-icon ui-icon-extlink\"]")private WebElement max;

	
	public AlertPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnSimple() {
		simple.click();

	}
	
	
	public void ClickOnConfirm() {
		confirm.click();
	}
	public void ClickOnsimple_dialog() {
		simple_dialog.click();
		
	}
	public void ClickOnDismiss() {		
		dismiss.click();
	}
	
	public void ClickOnsweet() {
		sweet.click();
	}
	public void ClickOnClose(WebDriver driver) {
	/*	Actions act=new Actions(driver);
		act.moveToElement(close);
		act.click().build().perform();
	*/	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit wait
		wait.until(ExpectedConditions.visibilityOf(close));
		close.click();
	}
	
	public void ClickOnPromot() {
		prompt_dialog.click();
		
	}
	public void ClickOnconfirmation() {
		confirmation.click();
		String result=text.getText();
		System.out.println(result);
		yes.click();
		
	}
	public void ClickOnMinMax() throws InterruptedException {
		minmax.click();
		//min.click();
		max.click();
		min.click();
        Thread.sleep(1000);
		closed.click();		
	}
	
}
