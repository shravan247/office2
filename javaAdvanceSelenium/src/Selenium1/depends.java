package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class depends {

	@Test(dependsOnMethods = "register")
	public void login( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void register( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//wrong linktext
		driver.findElement(By.linkText("Rigesterqq")).click();
	}
	@Test
	public void logout( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login");
	}
}
