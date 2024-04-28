package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//class level we have to use listener annotation
@Listeners(listenerBase.class)
public class listenerTest {
	ChromeDriver driver = new ChromeDriver();

	
	@Test
	public void test1() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

	@Test
	public void test2() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		// put wrong password and check
		driver.findElement(By.id("Password")).sendKeys("hemanthra");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

	@Test(timeOut = 1000)
	public void test3() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		// put wrong password and check
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

	@Test(dependsOnMethods = "test3")
	public void test4() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
		// put wrong password and check
		driver.findElement(By.id("Password")).sendKeys("hemanthrai");
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}

}
