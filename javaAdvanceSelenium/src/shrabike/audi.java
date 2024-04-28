package shrabike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class audi {
	@Test (groups = {"smoke", "system", "regression"})
	public void audii( ) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/in/web/en/models.html");
	}
}