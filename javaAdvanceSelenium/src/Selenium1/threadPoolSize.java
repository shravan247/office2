package Selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threadPoolSize {

	@Test(priority=1, invocationCount = 3, threadPoolSize = 3)
	public void login( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=2)
	public void register( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
}
