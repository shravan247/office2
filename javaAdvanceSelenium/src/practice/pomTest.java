package practice;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(pomListeners.class)
public class pomTest {
	//String email = "shravanBanglore1@gamil.com";
	//String pass = "shravan";
SoftAssert soft=new SoftAssert();
	@Test (priority = 1, dataProvider = "shra")
	public void register(String gender, String fname, String lname, String email, String pass, String cpass) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		pomWelcome w = new pomWelcome(driver);
		pomRegister r = new pomRegister(driver);
		w.getRegisterButton().click();
		if(gender.equalsIgnoreCase("male") ) {
			r.getGenderMale().click();
		}
		else {
			r.getGenderFemale().click();
		}
		r.getFirstname().sendKeys(fname);
		r.getLastname().sendKeys(lname);
		r.getEmail().sendKeys(email);
		r.getPassword().sendKeys(pass);
		r.getConfirmPassword().sendKeys(cpass);
		r.getRegisterButton().click();
		Thread.sleep(2000);
        boolean z = w.getLogoutButton().isDisplayed();
		soft.assertTrue(z);
		w.getLogoutButton().click();
		
	}
//we can give login dependsOnMethods="Register" --but if any test step fails in register than login wont execute :)
	@Test(priority =2, dataProvider = "shra")
	public void login(String gender, String fname, String lname, String email, String pass, String cpass) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		pomWelcome w = new pomWelcome(driver);
		w.getLoginButton().click();
		pomLogin l = new pomLogin(driver);
		l.getEmailid().sendKeys(email);
		l.getPassword().sendKeys(pass);
		l.getLoginbutton().click();
		Thread.sleep(2000);
		boolean x = w.getLogoutButton().isDisplayed();
		soft.assertTrue(x);
		w.getLogoutButton().click();
		soft.assertAll();
	}
	

	@DataProvider(name = "shra")
	public Object[][] data() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\practice\\pomRegister.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] d = new Object[rowsize-1][columnsize];
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < columnsize; j++) {
				d[i][j] = s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}
	
}
