package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver openbrowser(String url) {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
		
		
		
		
		
	}
	
}
