package AssignmentExcellFetch;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class LoginPage {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		Reporter.log(title+" is open",true);
	}

	@AfterMethod
	public void closeBrowser() {
		
		driver.quit();
	}

	@DataProvider(name = "logindata")
	public Object[][] data() throws IOException {
			FileInputStream fis = new FileInputStream("./data/Login_WebShop.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			int row = sheet.getPhysicalNumberOfRows();
			int cell = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] obj = new Object[row-1][cell];
			for (int i = 0; i < row-1; i++) {
				for (int j = 0; j < cell; j++) {
					obj[i][j] = sheet.getRow(i+1).getCell(j).toString();
				}
			}
		
		return obj;
	}
}

