package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.VideoPom;

public class VideoTest {

	WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser() {
		driver=Browser.openbrowser("https://www.leafground.com/video.xhtml;jsessionid=node0yi0hqrbgtkvf13jprkqhxxuny465706.node0");
	}
	
	@Test
	public void FirstVideo() throws InterruptedException {
		VideoPom videopom=new VideoPom(driver);
		videopom.FirstVideo(driver);
	}
	
	
	
	
	
	
}
