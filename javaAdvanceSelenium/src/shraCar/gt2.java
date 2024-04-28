package shraCar;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gt2 {
	@Test (groups = {"smoke"})
	public void R15V3( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/yamaha-bikes/r15-v3/");
	}
}
