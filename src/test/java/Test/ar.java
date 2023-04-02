package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import POJO.Browser;

public class ar {
  
	public static void main(String[] args) {
		
		
		WebDriver driver=Browser.openbrowser("https://www.facebook.com/login");
		
		
		List<WebElement> link=driver.findElements(By.tagName("a"));
		
		
		for( WebElement Alllink : link) {
			System.out.println(Alllink.getText()+ "--->" + Alllink.getAttribute("href"));
		}
	}
	
	
	
}
