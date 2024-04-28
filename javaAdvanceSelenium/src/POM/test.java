package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;

	@Test(dataProvider = "tata")
	public void login(String email, String pass) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demowebshop.tricentis.com/");
		welcome w = new welcome(driver);
		w.getLoginbutton().click();
		login l = new login(driver);
		System.out.println(email);
		l.getEmail().sendKeys(email);
		l.getPassword().sendKeys(pass);
		l.getLoginbutton().click();
		Thread.sleep(1000);

	}

	@DataProvider(name = "tata")
	public Object[][] data() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\practice\\framework_WebShop.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Login");
		int rowsize = s.getPhysicalNumberOfRows();
		int colsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize-1][colsize];
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < colsize; j++) {
				d[i][j] = s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}
}
