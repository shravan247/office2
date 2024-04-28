package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomRegister {

	//constructor
	public pomRegister(WebDriver driver) {
PageFactory.initElements(driver, this);
}
	
	@FindBy(id = "gender-male")
	private WebElement genderMale;
	@FindBy(id = "gender-female")
	private WebElement genderFemale;
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id="register-button")
	private WebElement registerButton;
	public WebElement getGenderMale() {
		return genderMale;
	}
	public WebElement getGenderFemale() {
		return genderFemale;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	//getters
	
}
