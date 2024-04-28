package shraCar;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gt3 {
	@Test(groups = {"adhoc"})
	public void hima( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bikewale.com/royalenfield-bikes/himalayan-650/");
	}
}
