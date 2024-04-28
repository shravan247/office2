package practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ssListener extends ssUtility implements ITestListener {
	WebDriver driver;

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail");
		/*
		 * try { takescreenshot(); } catch (Exception e) { e.printStackTrace(); }
		 */
		
		
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");

	
	}

}
