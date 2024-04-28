package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2 {
	@Test (dependsOnGroups = "smoke")
	public void Kawasaki() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://kawasaki-india.com/");
	}
}
