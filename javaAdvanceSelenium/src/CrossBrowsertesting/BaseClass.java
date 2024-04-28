package CrossBrowsertesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browserr) {
		if(browserr.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
		}
		else if(browserr.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/");
		}
		else {
			System.out.println("Incorrect browser");
		}
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
}
