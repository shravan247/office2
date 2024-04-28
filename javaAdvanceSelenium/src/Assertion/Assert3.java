package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert3 {
@Test
	public void testcase() {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	String BeforeRegister=driver.findElement(By.linkText("Register")).getText();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("hemanth");
	driver.findElement(By.id("LastName")).sendKeys("rai");
	driver.findElement(By.id("Email")).sendKeys("hemanthraii1@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("hemanthrai");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("hemanthrai");
	driver.findElement(By.id("register-button")).click();
	String Afterregister= driver.findElement(By.xpath("//a[text()='hemanthraii1@gmail.com']")).getText();
	Assert.assertNotEquals(BeforeRegister, Afterregister);

}
}
