package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert1 {
@Test
public void testcase() {
	//testdata
	//change the expected value then test case will fail
	String Expected="https://demowebshop.tricentis.com/";
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	String Actual=driver.getCurrentUrl();
	Assert.assertEquals(Expected, Actual);
	Reporter.log("testcase Completed", true);
}
}
