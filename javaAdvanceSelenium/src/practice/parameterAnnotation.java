package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterAnnotation {
    @Parameters({"email", "pass"})
	@Test
	public void lohin(String email, String pass) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}
}
