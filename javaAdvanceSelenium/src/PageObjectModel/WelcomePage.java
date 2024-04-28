package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//step2:constructor
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step1 register and login in welcomepage
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	@FindBy(linkText = "Log in")
private WebElement loginlink;
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	//getter

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}
	

}
