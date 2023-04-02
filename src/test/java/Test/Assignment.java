package Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment {

     public static void main(String[] args) throws InterruptedException {
		//launch browser
	       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://trello.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);		
		
		   //login Trello
		   driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
		   driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("archanawadkar98@gmail.com");
		   driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Archana@123");
		   driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		   
		   //create list
		WebElement create=driver.findElement(By.xpath("//button[@data-testid=\"header-create-menu-button\"]"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(3000));//Explicit wait
		wait.until(ExpectedConditions.visibilityOf(create));
		create.click();
	
		WebElement create_Board=driver.findElement(By.xpath("//button[@data-testid=\"header-create-board-button\"]"));
		create_Board.click();
		
		WebElement title=driver.findElement(By.xpath("//input[@data-testid=\"create-board-title-input\"]"));
		title.sendKeys("List A");
		
		WebElement confirm=driver.findElement(By.xpath("//button[text()='Create']")) ;
		confirm.click();
		
		Actions act=new Actions(driver);
        Thread.sleep(500);
		WebElement bar=driver.findElement(By.xpath("(//span[@aria-label=\"AddIcon\"])[2]"));
		act.moveToElement(bar).click().build().perform();
			
		WebElement title2=driver.findElement(By.xpath("//input[@data-testid=\"create-board-title-input\"]"));
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit wait
		waits.until(ExpectedConditions.visibilityOf(title2));//
		title2.sendKeys("List B");
		
		WebElement confirm2=driver.findElement(By.xpath("//button[text()='Create']")) ;
		confirm2.click();
	    Thread.sleep(2000);
		
		WebElement comment=driver.findElement(By.xpath("//textarea[@placeholder=\"Enter a title for this card…\"]"));
		act.sendKeys("Test B").build().perform();
		
		WebElement addcard=driver.findElement(By.xpath("//input[@value=\"Add card\"]"));
		act.moveToElement(addcard).click().build().perform();
		
		//Thread.sleep(1000);
		
		WebElement source=driver.findElement(By.xpath("(//textarea[@class=\"list-header-name mod-list-name js-list-name-input\"])[1]"));
		//WebElement destination=driver.findElement(By.xpath("//textarea[text()='Done']"));
		WebDriverWait waitts=new WebDriverWait(driver,Duration.ofMillis(2000));//Explicit wait
		waitts.until(ExpectedConditions.visibilityOf(source));
	
		act.dragAndDropBy(source, 400, 200).build().perform();
		
		driver.findElement(By.xpath("//div[@class=\"yRPuNUIoZpQWwj\"]")).click();
		
		//logout
		WebElement logout=driver.findElement(By.xpath("//span[text()='Log out']"));
		act.moveToElement(logout).click().build().perform();
		
		driver.findElement(By.xpath("//button[@id=\"logout-submit\"]")).click();
		
		driver.close();
		
	}

}
