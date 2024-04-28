package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class crossbrowsingBASE {
	
	WebDriver driver;
	@Parameters("bro")
	@BeforeClass
	public void openbrowser(String brr) {
    if(brr.equalsIgnoreCase("chrome")) {
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
    }
    else if(brr.equalsIgnoreCase("firefox")) {
    	driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
    }
    else {
    	System.out.println("incorrect browser");
    }
	}
	@AfterClass
	public void closebr() {
		driver.quit();
	}
}
