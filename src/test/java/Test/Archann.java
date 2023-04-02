package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Archann {
   
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
	
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=13491794413490237187&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007783&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		
		driver.manage().window().maximize();
		
		WebElement serch=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		serch.sendKeys("Laptop");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.perform();
		
	}
	
	
}
