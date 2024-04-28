package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomWelcome {

	public pomWelcome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "ico-register")
	private WebElement registerButton;
	@FindBy(className = "ico-login")
	private WebElement loginButton;
	@FindBy(className = "ico-logout")
	private WebElement logoutButton;

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}