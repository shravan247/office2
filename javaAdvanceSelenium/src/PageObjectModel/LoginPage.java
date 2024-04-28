package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// step2:constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	private WebElement emailid;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	@FindBy(linkText = "Log In")
	private WebElement login;

	// getter
	public WebElement getLogin() {
		return login;
	}

	// setter for login
	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
