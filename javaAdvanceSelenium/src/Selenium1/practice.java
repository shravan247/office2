package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
	String email = "shravanshettyyyy16@gmail.com";
	String pass="shravan";

	@Test(dependsOnMethods = "register")
	public void logout() {

		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void register() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shravan");
		driver.findElement(By.id("LastName")).sendKeys("shetty");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText(email)).isDisplayed();
		Thread.sleep(2000);

	}

	@Test(dependsOnMethods = "logout")
	public void login() throws Exception {

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText(email)).isDisplayed();
		Thread.sleep(4000);
		logout();

	}

}
