package shrabike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class podi {
	@Test (groups = {"smoke", "smokesystem"})
	public void hima( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
	}
}
