package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class amazonassertionpractice {

	@Test
	public void test1() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		SoftAssert softassert=new SoftAssert();
		//verify page title
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		softassert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//verify error message
		driver.findElement(By.id("email")).sendKeys("shravan", Keys.ENTER);
		String errorActual=driver.findElement(By.xpath("(//h2[text()='Please identify this account another way'])[last()]")).getText();
		String errorExpected="Please identify this account another way";
		softassert.assertEquals(errorActual, errorExpected,  "Wrong error msg");
		
		//try again
		boolean button = driver.findElement(By.xpath("//a[text()='Try Again']")).isSelected();
		softassert.assertTrue(button, "Button not present");
		driver.quit();
		softassert.assertAll();
	}
}
