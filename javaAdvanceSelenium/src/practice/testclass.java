package practice;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testclass extends baseclass {

	@Test

	public void tescase1() throws InterruptedException {
		Reporter.log("testcase is executing", true);
		driver.findElement(By.xpath("//div[@data-productid='31']//input[@class='button-2 product-box-add-to-cart-button']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
	}
}
