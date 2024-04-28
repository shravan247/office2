package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	@Test (groups  ={"smoke"})
	public void RoyalEnfiled() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
	}
}
