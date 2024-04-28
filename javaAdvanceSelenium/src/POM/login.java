package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement Email;
	@FindBy(id = "Password")
	private WebElement Password;
	@FindBy(xpath = "//div[@class='buttons']//input[@type='submit']")
	private WebElement Loginbutton;
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	
}
