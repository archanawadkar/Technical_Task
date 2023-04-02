package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePom {

	@FindBy(xpath="//span[@id='j_idt88:j_idt89']")private WebElement choose;
	@FindBy(xpath="//input[@id=\"j_idt88:j_idt89_input\"]")private WebElement text;
	
	@FindBy(xpath="//button[@id='j_idt93:j_idt95']")private WebElement button;
	@FindBy(xpath="//span[@id='j_idt97:j_idt98_label']")private WebElement picture;
	
	
	public FilePom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Choosefile() throws InterruptedException {
		choose.click();
		//Thread.sleep(1000);
		//Using sendkeys upload file
		text.sendKeys("C:\\Users\\Archana\\OneDrive\\Documents\\Antiviral Chemotherapy.pptx");
	}
	
	
	public void Downloadfile() {
		button.click();
	}
	
	public void ChoosePic() throws AWTException {
		picture.click();
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//put path to file in a clipboard
		StringSelection ss=new StringSelection("C:\\Users\\Archana\\Downloads\\Archana Img.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//ENTR
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
