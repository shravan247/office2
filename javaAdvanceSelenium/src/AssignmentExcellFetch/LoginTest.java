package AssignmentExcellFetch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends LoginPage {
	@Test(dataProvider = "logindata")
	public void test(String user, String pass) {
		WebElement loginlink = driver.findElement(By.linkText("Log in"));
		loginlink.click();
		WebElement username = driver.findElement(By.id("Email"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(pass);
		password.submit();

		WebElement logout = null;
		try {

			logout = driver.findElement(By.linkText("Log out"));
			if (logout.isDisplayed()) {
				Reporter.log("Login Successfully", true);
			}
			logout.click();
		} catch (Exception e) {
			e.getMessage();
			Reporter.log("Invalid Credentials", true);
		}
	}
}
