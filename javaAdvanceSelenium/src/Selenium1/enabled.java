package Selenium1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enabled {

	@Test(priority=2, invocationCount = 3, enabled = false)
	public void login( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=3)
	public void register( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	@Test(priority=1)
	public void logout( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
	}
}
