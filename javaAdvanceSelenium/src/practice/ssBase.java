package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ssBase {
	public static WebDriver driver;
	public static String ssSubFolderName;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
}
