package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	//step2:create constructor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	//getter rightclick+source+getter
	public WebElement getRegisterlink() {
		return registerlink;
	}
	
}
