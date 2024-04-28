package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderAnnotationEXCEL {

	@Test(dataProvider = "shravan")
	public void tc(String email, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}

	@DataProvider(name = "shravan")
	public Object[][] data() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\practice\\dataproviderAnnotation.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int rowsize = sheet.getPhysicalNumberOfRows();
		int columnsize = sheet.getRow(1).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize][columnsize];
		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < columnsize; j++) {
				d[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}

}
