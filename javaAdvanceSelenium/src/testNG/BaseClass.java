package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class BaseClass {
	ChromeDriver driver;
	@BeforeSuite 
	public void connectServer() {
		Reporter.log("connecting to the server", true);
	}
	@BeforeTest
	public void connectDatabase() {
		Reporter.log("connecting to the database", true);
	}
	@BeforeClass 
	public void openBrowser() {
		Reporter.log("openning the browser", true);
		//connect to webshop  -https://demowebshop.tricentis.com/
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Login", true);
		//login using creds
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}
	@AfterMethod
	public void Logout() throws InterruptedException {
		Reporter.log("Logout", true);
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("Close browser", true);
		driver.quit();
	}
	@AfterTest
	public void disconnectdatabase() {
		Reporter.log("disconnect the database", true);
	}
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("disconnect the Server", true);
	}
}
