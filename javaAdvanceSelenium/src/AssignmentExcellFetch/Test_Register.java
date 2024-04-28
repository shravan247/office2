package AssignmentExcellFetch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Register extends Register_Base_Class {
	@Test
	public void register1() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet1","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet1","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet1","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet1","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet1","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet1","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test
	public void register2() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet2","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet2","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet2","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet2","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet2","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet2","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test
	public void register3() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet3","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet3","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet3","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet3","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet3","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet3","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test()
	public void register4() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet4","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet4","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet4","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet4","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet4","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet4","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test
	public void register5() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet5","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet5","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet5","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet5","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet5","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet5","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test
	public void register6() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet6","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet6","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet6","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet6","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet6","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet6","Password"));
		driver.findElement(By.id("register-button")).click();
	}
	
	@Test
	public void register7() {
		driver.findElement(By.linkText("Register")).click();
		String gender=data("Sheet7","Gender");
		driver.findElement(By.xpath("//label[text()='"+gender+"']/preceding-sibling::input")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data("Sheet6","First name"));
		driver.findElement(By.id("LastName")).sendKeys(data("Sheet6","Last name"));
		driver.findElement(By.id("Email")).sendKeys(data("Sheet6","Email"));
		driver.findElement(By.id("Password")).sendKeys(data("Sheet6","Password"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data("Sheet6","Password"));
		driver.findElement(By.id("register-button")).click();
	}
}
