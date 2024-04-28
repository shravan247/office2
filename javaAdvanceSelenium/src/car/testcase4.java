package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase4 {
	@Test (groups ="smoke")
	public void audi() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en.html");
	}
}
