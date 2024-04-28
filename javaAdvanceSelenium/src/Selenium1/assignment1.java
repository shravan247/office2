package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment1 {
	ChromeDriver driver=new ChromeDriver();
	
	
	@Test (dependsOnMethods = "logout")
	public void login() throws Throwable {
		//driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).isDisplayed();
		Thread.sleep(4000);
		
		logout();
	}
	@Test
	public void register() throws Throwable {
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("hemanth");
		driver.findElement(By.id("LastName")).sendKeys("rai");
		driver.findElement(By.id("Email")).sendKeys("hemanthrai97@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("hemanthrai");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("hemanthrai97@gmail.com")).isDisplayed();
		Thread.sleep(2000);
	}
	@Test (dependsOnMethods = "register")
	public void logout() throws Throwable {
		//driver=new ChromeDriver();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
        //driver.quit();
	}
}
