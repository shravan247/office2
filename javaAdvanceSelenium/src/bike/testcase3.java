package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	@Test (groups = "integration")
	public void Yamaha() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
	}
}
