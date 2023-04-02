package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class ScreenShot {

	public static void  takeScreenshot(WebDriver driver ,String name) throws IOException {
		//WebDriver driver=Browser.openbrowser();
		String d=ScreenShot.Date();
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File drstination=new File("C:\\Users\\Archana\\OneDrive\\Pictures\\TestLeafSS\\"+ name + d +".jpg");
		
		FileHandler.copy(source, drstination);
	

	}
	 

	public static String Date() {
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-mm-dd-hh-mm-ss");
		LocalDateTime currentTime=LocalDateTime.now();
		String d=dtf.format(currentTime);
		return d;
	}
	
	
	
	
	
}
