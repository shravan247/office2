package practice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ssListener.class)


public class ssTest extends ssBase {

	@Test (testName = "web")
	public void test1() throws Exception {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		//utility.takeScreenshot(driver, "Img1.png");
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hemanthra");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
		assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
	}
		@Test (testName = "zz")
		public void test2() {
			driver.get("https://demowebshop.tricentis.com/");
			assertTrue(false);
		
	}
}