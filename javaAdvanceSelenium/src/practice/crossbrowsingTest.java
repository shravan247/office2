package practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class crossbrowsingTest extends crossbrowsingBASE {
	@Test
	public void TC() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys("shravanshettyyyy16@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shravan");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}
}
