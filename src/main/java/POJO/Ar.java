package POJO;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ScreenShot;

public class Ar {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://hi-in.facebook.com/");
		driver.manage().window().maximize();
		ScreenShot.takeScreenshot(driver, "FBBBB");
	}
	
	
	
	
	
}
