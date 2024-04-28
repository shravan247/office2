package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testt {
	@Test 
	public void testCase() {
		WebDriver driver = new ChromeDriver();
		// we can use properties also
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage w = new WelcomePage(driver);
		w.getRegisterlink().click();
		RegisterrPage r = new RegisterrPage(driver);
		r.getGender().click();
		r.getFirstname().sendKeys("shravan");
		r.getLastname().sendKeys("shetty");
		r.getEmail().sendKeys("shravanshetty21@gmail.com");
		r.getPassword().sendKeys("shravan");
		r.getConfirmpassword().sendKeys("shravan");
		r.getReegisterbutton().click();
		w.getLogoutlink().click();
		
		LoginPage l = new LoginPage(driver);
		w.getLoginlink().click();
		l.getEmailid().sendKeys("shravanshetty3@gmail.com");
		l.getPassword().sendKeys("shravan");
		l.getLoginbutton().click();
		w.getLogoutlink().click();

	}
}