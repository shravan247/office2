package TestNgListener;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListernerImplementation.class)

public class Testcase {
	@Test
	public void testcase() {
ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("hemanthrai95@gmail.com");
	//put wrong password and check
	driver.findElement(By.id("Password")).sendKeys("hemanthrai");
	driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	driver.findElement(By.linkText("Log out")).click();
	}

}
