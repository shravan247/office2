package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert2 {
	@Test
	public void testcase() {
		//testdata
		String Expected="https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Actual=driver.getCurrentUrl();
		org.testng.asserts.SoftAssert s=new org.testng.asserts.SoftAssert();
		s.assertEquals(Expected, Actual);
		Reporter.log("testcase completed", true);
		//for softassert we have to use assertall , it will throw exception
		s.assertAll();
	}
}
