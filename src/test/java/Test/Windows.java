package Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import POJO.Browser;

public class Windows {
      public static void main(String[] args) throws InterruptedException {
		
    	  WebDriver driver=Browser.openbrowser("https://www.leafground.com/window.xhtml");
    	  
    	  WebElement open=driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
    	  open.click();
          Set<String>adres=driver.getWindowHandles();	  
     	  Iterator<String> i=adres.iterator();
         
    	  String parentid=i.next();
    	  String childid=i.next();
    	  
    	  driver.switchTo().window(childid);
    	  System.out.println(driver.getTitle());
    	  //driver.close();
    	  driver.switchTo().window(parentid);
    	  String tile=driver.getTitle();
    	  System.out.println(tile);
    	  
    	  if(tile.equals("Window")) {
    	  WebElement openmulti=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
    	  openmulti.click();
    	  Set<String>adr=driver.getWindowHandles();
    	  int size=adr.size();
    	  System.out.println(size);
    	  }
    	  //driver.close();   closed the main window selenium is focusing
    	  
    	  Set<String>adress=driver.getWindowHandles();	  
     	  Iterator<String> idk=adress.iterator();
     	  String parent=idk.next();
   	      String child=idk.next();
    	  driver.switchTo().window(child);
    	  System.out.println(driver.getTitle());
      //    driver.switchTo().window(parent);
    	  driver.close();
    	  driver.switchTo().window(parent);
    	  System.out.println(driver.getTitle()); 
    	  
    	  WebElement closealls=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
    	  closealls.click();
    	  
    	  Set<String>ad=driver.getWindowHandles();	  
     	  Iterator<String> is=ad.iterator();
     	  String par=is.next();
   	      String chil=is.next();
    	  driver.switchTo().window(chil);
    	  System.out.println(driver.getTitle());
    	  driver.close();
    	  driver.switchTo().window(par);
    	  System.out.println(driver.getTitle()); 
    	 
    	  WebElement opendelay=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']"));
    	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));//Explicit wait
  		  wait.until(ExpectedConditions.visibilityOf(opendelay));//will recheck the element in 500ms
  	      opendelay.click(); 
    	  driver.switchTo().window(chil);
          driver.close();
  	     
  	  
  	  
    
  	  
  	  
  	  
	}
	
	
}
