package practice;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class practiceTest {
	WebDriver driver= new ChromeDriver();

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
