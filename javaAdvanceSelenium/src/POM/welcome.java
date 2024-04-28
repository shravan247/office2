package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcome {

	public welcome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className ="ico-register")
	private WebElement registerbutton;
	@FindBy(className ="ico-login")
	private WebElement loginbutton;
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
}
