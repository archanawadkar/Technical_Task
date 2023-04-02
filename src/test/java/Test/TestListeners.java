package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class TestListeners extends BaseTest implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+ "Test is started");
//		try {
//			ScreenShot.takeScreenshot(driver, result.getName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			ScreenShot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(result.getName()+ "Test is failure");
	}
	public void onTestSucces(ITestResult result) {
		try {
			ScreenShot.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(result.getName()+"Test executed succesfuly");
		
	}
	
	
	
}
