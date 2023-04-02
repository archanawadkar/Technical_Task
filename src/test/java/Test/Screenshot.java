package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class Screenshot {
    public static void main(String[]args) throws IOException {
    	WebDriver driver=Browser.openbrowser("https://vctcpune.com/");
    	
    	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	File destination=new File("C:\\Users\\Archana\\OneDrive\\Pictures\\Screenshots\\archana.jpeg");
    	
    	FileHandler.copy(source, destination);
    }
	
}


