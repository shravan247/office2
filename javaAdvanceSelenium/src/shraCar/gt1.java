package shraCar;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gt1 {
	@Test (groups = {"smokesystem"})
	public void continentalGT( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/news/2023-royal-enfield-continental-gt-650-whats-new/");
	}
	
}