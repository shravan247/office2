package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseclass {
	WebDriver driver;

	@BeforeSuite
	public void cserver() {
		Reporter.log("connecting to server", true);
	}

	@BeforeTest
	public void cDB() {
		Reporter.log("connecting to db", true);
	}

	@BeforeClass
	public void openbr() {
		Reporter.log("openning the browser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login to app", true);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys("shravanshettyyyy16@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shravan");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}

	@AfterMethod
	public void logout() throws Exception {
		Reporter.log("logout of app", true);
		driver.findElement(By.cssSelector("[class='ico-logout']")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void cpenbr() {
		Reporter.log("clossing the browser", true);
		driver.quit();
	}

	@AfterTest
	public void dcDB() {
		Reporter.log("disconnecting to db", true);
	}

	@AfterSuite
	public void dcserver() {
		Reporter.log("disconnecting to server", true);
	}
}
