package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase6 {
	@Test (groups = "integration")
	public void mustang() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ford.com/cars/mustang/");
	}
}
