package CrossBrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {

	@Test
	public void testcase() {
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("hemanthrai");
	driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	driver.findElement(By.linkText("Log out")).click();
	}

}

