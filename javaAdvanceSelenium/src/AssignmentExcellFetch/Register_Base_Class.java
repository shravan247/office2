package AssignmentExcellFetch;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Register_Base_Class {
	public WebDriver driver;

	public static String data(String sh, String str) {
		String obj = null;
		try {
			FileInputStream fis = new FileInputStream("./data/Register.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheet(sh);
			int rowsize = sheet.getPhysicalNumberOfRows();
			int cellsize = sheet.getRow(0).getPhysicalNumberOfCells();
			for (int i = 0; i < rowsize; i++) {
				for (int j = 0; j < cellsize; j++) {
					String value = sheet.getRow(i).getCell(j).toString();
					if (str.contains(value)) {
						obj = sheet.getRow(i).getCell(j + 1).toString();
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	@BeforeMethod
	public void openWebApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterMethod
	public void logoutWebApplication() {
		try {
			driver.findElement(By.linkText("Log out")).click();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		driver.quit();
	}

}
