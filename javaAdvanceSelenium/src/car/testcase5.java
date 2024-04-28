package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase5 {
	@Test 
	public void dodge() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.dodge.com/challenger.html");
	}
}
