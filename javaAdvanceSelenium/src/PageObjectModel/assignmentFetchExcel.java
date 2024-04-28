package PageObjectModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class assignmentFetchExcel {
	WebDriver driver = new ChromeDriver();
	WelcomePage w = new WelcomePage(driver);

	@Test(dataProvider = "data", priority = 1)
	public void Register(String fn, String ln, String em, String ps, String cps) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterlink().click();
		RegisterrPage r = new RegisterrPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys(fn);
		r.getLastname().sendKeys(ln);
		r.getEmail().sendKeys(em);
		r.getPassword().sendKeys(ps);
		r.getConfirmpassword().sendKeys(cps);
		r.getReegisterbutton().click();
		Thread.sleep(1000);
		w.getLogoutlink().click();
	}

	@Test(dataProvider = "data", priority = 2)
	public void Login(String fn, String ln, String em, String ps, String cps) throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage l = new LoginPage(driver);
		w.getLoginlink().click();
		l.getEmailid().sendKeys(em);
		l.getPassword().sendKeys(ps);
		l.getLoginbutton().click();
		Thread.sleep(2000);
		w.getLogoutlink().click();

	}

	@DataProvider(name = "data")
	public Object[][] testData() throws Exception, IOException {
		FileInputStream f = new FileInputStream(
				"C:\\Users\\shrad\\eclipse-workspace\\javaAdvanceSelenium\\excell\\pomm.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("Sheet1");
		int row = s.getPhysicalNumberOfRows();
		int column = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[row - 1][column];
		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j < column; j++) {
				d[i][j] = s.getRow(i + 1).getCell(j).toString();
			}
		}

		return d;
	}

}
