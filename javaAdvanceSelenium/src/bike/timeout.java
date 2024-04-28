package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {
@Test (timeOut =10000)
public void open() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
}
}
