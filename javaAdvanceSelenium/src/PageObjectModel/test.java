package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test
	public void testCase() {
		WebDriver driver=new ChromeDriver();
		//we can use properties also
		driver.get("https://demowebshop.tricentis.com/");
		RegisterPage r =new RegisterPage(driver);
		r.getRegisterlink().click();
	}
}
