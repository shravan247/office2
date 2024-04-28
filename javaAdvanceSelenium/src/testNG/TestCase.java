package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {

	@Test
	public void testcase1() {
		Reporter.log("testcase is pass", true);
		driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();
	}
}
