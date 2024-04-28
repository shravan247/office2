package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderAnnotation {

	@Test (dataProvider = "shravan")
	public void login(String email, String pass) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}
	@DataProvider(name="shravan") 
	public Object[][] data() {
		Object[][] d=new Object[2][2];
		d[0][0]="shravanshettyyyy16@gmail.com";
		d[0][1]="shravan";
		d[1][0]="shravanshettyyyy15@gmail.com";
		d[1][1]="shravan";
		return d;
	}
	
}
